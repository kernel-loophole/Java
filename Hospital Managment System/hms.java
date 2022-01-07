public class hms
{
    private  static patinet[] p1;
    private static patinet p2;
    public static void main(String[] args) {
        System.out.println("helloo");
        p1=new patinet[2];
        p2=new patinet(122,112222, "Hiader", "aaass");
      
        p1[0]=new patinet(122,112222, "Hiader", "aaass");
        p1[1]=new patinet(122,112222, "Hiader", "aaass");
        int check=  p2.choice();
        if(check==1)
        {
            form f = new form();

            System.out.println("hello you press 1 ");
        }
        else if(check==2)
        {
            System.out.println("hello you press 2 ");
        }
        else
        {
            System.out.println("invlid choice ");
        }
        System.out.println("this is main class "+check);
        p2.login("test","1223");
       
        
    }
}