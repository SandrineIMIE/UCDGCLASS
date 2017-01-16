package GCLASS;

import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
public static void main(String[] args) {
  try {
    //Nous appelons quatre fois la méthode getInstance()
    PreparedStatement prepare = BDDConnectSingleton.getInstance().prepareStatement("SELECT * FROM USER WHERE cls_nom = ?");

    Statement state = BDDConnectSingleton.getInstance().createStatement();

    BDDConnectSingleton.getInstance().setAutoCommit(false);

    DatabaseMetaData meta = BDDConnectSingleton.getInstance().getMetaData();
       
  } catch (SQLException e) {
    e.printStackTrace();
  }
}
}