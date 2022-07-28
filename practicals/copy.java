/* Write a program that copies a content of one file to another. Pass
the name of the files through command line arguments...

@author anandmaurya542@gmail.com  University of Delhi...

 */

import java.io.*;
class copy{
    public static void main(String[] args) throws Exception {
        if(args.length!=2){
            System.err.println("Usage: java copy <src><dest>");

        }
        else{
            int i;
            FileInputStream r=new FileInputStream(args[0]);
            FileOutputStream w=new FileOutputStream(args[1]);
            while((i=r.read())!=-1){
                w.write(i);
            }
            r.close();
            w.close();
            System.out.println("Copied contents of "+args[0]+" to "+args[1]);

        }
    }
}