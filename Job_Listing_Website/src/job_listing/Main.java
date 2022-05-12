package job_listing;

public class Main {
    public static void main(String[] args) {
        DBOperations dbo = new DBOperations();
        //dbo.application_insert("deez","deeznuts@gmail.com",666,"nairobi","1/1/1911","male", "Kenyan","Manager", "none","Certificate","Artist","Swimming");
        //dbo.application_update("deez","deeznuts@gmail.com","sugondese@gmail.com",666,"nairobi","1/1/1911","male", "Kenyan","Manager", "none","Certificate","Artist","Swimming");
        //System.out.println(dbo.application_select());
        dbo.application_delete("kteer@gmail.com");
    }
}
