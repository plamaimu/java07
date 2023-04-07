

import org.springframework.context.support.GenericApplicationContext;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author porns
 */
class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World!!!");
        GenericApplicationContext context;
        context = new GenericApplicationContext();
        /* context.registerBean(Stadium.class); */
        context.registerBean("s1", Stadium.class);
        context.registerBean("s2", Stadium.class);
        context.registerBean("s3", Stadium.class);
       
        context.refresh();
        /* Stadium x = context.getBean(Stadium.class); /* Return address of bean */ 
        Stadium u = context.getBean("s2",Stadium.class);
        u.name = "Anfield";
        u.seats = 37000;
        Stadium x = context.getBean("s3", Stadium.class);
        x.name = "OLD Trafford";
        x.seats = 40000;
        /* Stadium y = context.getBean(Stadium.class); /* Return the same address value with x */
        System.out.println(u.name);
        System.out.println(x.name);
        System.out.println(x.seats);
    }
}
class Stadium {
    String name;
    int seats;
}



/*
 Spring Bean is also known as Managed Instance.
   Manageble Instance --------'

 Create only one time.
*/