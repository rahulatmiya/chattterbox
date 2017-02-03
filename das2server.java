package divyesh;



import java.io.*;
import java.net.*;
import java.util.*;

/*
 * @author Rahul Yadav
 */
public class das2server {

    public static ArrayList<PrintWriter> al = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        System.out.println("Server ON ");
        ServerSocket ss = new ServerSocket(9081);
        for (int i = 0; i < 10; i++) {
            Socket soc = ss.accept();
            
            BufferedReader nis = new BufferedReader(
                new InputStreamReader(
                        soc.getInputStream()
                )
        );
        PrintWriter nos = new PrintWriter(
                new BufferedWriter(
                        new OutputStreamWriter(
                                soc.getOutputStream()
                        )
                ), true
        );
        das2server.al.add(nos);
        String str = nis.readLine();
        while (!str.equals("End")) {
            
            System.out.println(str);
            for (PrintWriter o : das2server.al) {
                o.println(str);
            }
            str = nis.readLine();
        }
        }System.out.println("Server OFF");}}

    


