import java.util.Properties;
import java.io.FileInputStream;
class PropertiesExample 
{
  public static void main(String[] args) throws Exception
  {
    Properties properties = new Properties();
    properties.load(new FileInputStream("database.properties.txt"));
    System.out.println("The driver Name is = "+properties.getProperty("DriverName"));
    System.out.println("The Databse Name is = "+properties.getProperty("url"));
    System.out.println("The Databse Name is = "+properties.getProperty("username")); 
  }
}