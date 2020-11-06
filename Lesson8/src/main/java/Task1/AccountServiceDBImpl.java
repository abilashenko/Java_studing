package Task1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountServiceDBImpl implements AccountService {
    @Override
    public void balance(int accountID) throws UnknownAccountException {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            try {
                connection = DriverManager.getConnection("jdbc:h2:file:~/test");
                String sql = "SELECT * FROM ACCOUNT WHERE ID=?";
                statement = connection.prepareStatement(sql);
                statement.setInt(1, accountID);
                ResultSet resultSet = statement.executeQuery();

                if (!resultSet.next()) {
                    throw new UnknownAccountException("(id = " + accountID + ")");
                }

                String holder = resultSet.getString(2);
                int amount = resultSet.getInt(3);

                System.out.println(holder + ", Баланс: " + amount);

            } finally {
                try {
                    if (statement != null) {
                        statement.close();
                    }
                } catch (Exception e) {
                }

                try {
                    if (connection != null) {
                        connection.close();
                    }
                } catch (Exception e) {
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void withdraw(int accountID, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        Connection connection = null;
        PreparedStatement statement = null;

        isAccount(accountID);

        try {
            try {
                connection = DriverManager.getConnection("jdbc:h2:file:~/test");
                String sql = "UPDATE ACCOUNT SET AMOUNT = AMOUNT - ? WHERE ID = ? AND AMOUNT >= ?";
                statement = connection.prepareStatement(sql);
                statement.setInt(1, amount);
                statement.setInt(2, accountID);
                statement.setInt(3, amount);
                statement.executeUpdate();
                System.out.println("Операция выполнена успешно!");

                if (statement.getUpdateCount() == 0) {
                    throw new NotEnoughMoneyException("(id = " + accountID + ")");
                }
            } finally {
                try {
                    if (statement != null) {
                        statement.close();
                    }
                } catch (Exception e) {
                }

                try {
                    if (connection != null) {
                        connection.close();
                    }
                } catch (Exception e) {
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void deposit(int accountID, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        Connection connection = null;
        PreparedStatement statement = null;

        isAccount(accountID);

        try {
            try {
                if (amount <= 0) {
                    throw new NotEnoughMoneyException("(id = " + accountID + ")");
                }

                connection = DriverManager.getConnection("jdbc:h2:file:~/test");
                String sql = "UPDATE ACCOUNT SET AMOUNT = AMOUNT + ? WHERE ID = ?";
                statement = connection.prepareStatement(sql);
                statement.setInt(1, amount);
                statement.setInt(2, accountID);
                statement.executeUpdate();

                System.out.println("Операция выполнена успешно!");

                if (statement.getUpdateCount() == 0) {
                    throw new UnknownAccountException("(id = " + accountID + ")");
                }
            } finally {
                try {
                    if (statement != null) {
                        statement.close();
                    }
                } catch (Exception e) {
                }

                try {
                    if (connection != null) {
                        connection.close();
                    }
                } catch (Exception e) {
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        Connection connection = null;
        PreparedStatement statement = null;

        isAccount(from);
        isAccount(to);

        try {
            try {
                connection = DriverManager.getConnection("jdbc:h2:file:~/test");
                connection.setAutoCommit(false);
                String sql = "UPDATE ACCOUNT SET AMOUNT = AMOUNT - ? WHERE ID = ? AND AMOUNT >= ?";
                statement = connection.prepareStatement(sql);
                statement.setInt(1, amount);
                statement.setInt(2, from);
                statement.setInt(3, amount);
                statement.executeUpdate();

                if (statement.getUpdateCount() == 0) {
                    connection.rollback();
                    throw new NotEnoughMoneyException("(id = " + from + ")");
                }

                sql = "UPDATE ACCOUNT SET AMOUNT = AMOUNT + ? WHERE ID = ?";
                statement = connection.prepareStatement(sql);
                statement.setInt(1, amount);
                statement.setInt(2, to);
                statement.executeUpdate();

                connection.commit();
                connection.setAutoCommit(true);

                System.out.println("Операция выполнена успешно!");

            } finally {
                try {
                    if (statement != null) {
                        statement.close();
                    }
                } catch (Exception e) {
                }

                try {
                    if (connection != null) {
                        connection.close();
                    }
                } catch (Exception e) {
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void isAccount(int accountID) throws UnknownAccountException {

        String sql = "SELECT * FROM ACCOUNT WHERE ID=?";
        try (Connection connection = DriverManager.getConnection("jdbc:h2:file:~/test");
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()
        ) {
            statement.setInt(1, accountID);
            if (!resultSet.next()) {
                throw new UnknownAccountException("(id = " + accountID + ")");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}