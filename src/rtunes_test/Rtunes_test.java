package rtunes_test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Jacobo
 */
public class Rtunes_test {

    
    public static void main(String[] args) {
        
       ProgramEntry(); 
       Albums.set();
       Albums.runProgram();
  
    }

    public static void ProgramEntry(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter 1 to access main code");
        int answer_1 = userInput.nextInt();
        
        if (answer_1 == 1){
            System.out.println("------------------------------------------------------------------------------------ \n");           
            System.out.println("     ___                         ___           ___           ___           ___    ");
            System.out.println("    /  /\\          ___          /  /\\         /  /\\         /  /\\         /  /\\   ");
            System.out.println("   /  /::\\        /__/\\        /  /:/        /  /::|       /  /::\\       /  /::\\   ");
            System.out.println("  /  /:/\\:\\       \\  \\:\\      /  /:/        /  /:|:|      /  /:/\\:\\     /__/:/\\:\\   ");
            System.out.println(" /  /::\\ \\:\\       \\__\\:\\    /  /:/        /  /:/|:|__   /  /::\\ \\:\\   _\\_ \\:\\ \\:\\  ");
            System.out.println("/__/:/\\:\\_\\:\\      /  /::\\  /__/:/     /\\ /__/:/ |:| /\\ /__/:/\\:\\ \\:\\ /__/\\ \\:\\ \\:\\  ");
            System.out.println("\\__\\/~|::\\/:/     /  /:/\\:\\ \\  \\:\\    /:/ \\__\\/  |:|/:/ \\  \\:\\ \\:\\_\\/ \\  \\:\\ \\:\\_\\/  ");
            System.out.println("   |  |:|::/     /  /:/__\\/  \\  \\:\\  /:/      |  |:/:/   \\  \\:\\ \\:\\    \\  \\:\\_\\:\\   ");
            System.out.println("   |  |:|\\/     /__/:/        \\  \\:\\/:/       |__|::/     \\  \\:\\_\\/     \\  \\:\\/:/   ");
            System.out.println("   |__|:|       \\__\\/          \\  \\::/        /__/:/       \\  \\:\\        \\  \\::/   ");
            System.out.println("   \\__\\ |                       \\__\\/         \\__\\/         \\__\\/         \\__\\/   ");
            System.out.println("\n");
            System.out.println("------------------------------------------------------------------------------------ \n");
            System.out.println("\n \n");
            
        }}
    
    
}




class Albums{
    String name;
    String artist;
    String[] songs;
    static ArrayList <Albums> allAlbums = new <Albums> ArrayList();
    static int k = 0;
    static String [][] allSongs = new String [8][3];
    
    public void album(String name, String artist, String[] songs){
        this.name = name;
        this.artist = artist;
        this.songs = songs;
    }
    

    public static void set(){
         // Create all the songs for the albums
         
        String[] album_1Songs = {"You Can't Stump the Trump", "A Wind in Boston", "Tiny Children Are Not Horses", "Secret Democrat"};
        String[] album_2Songs = {"Import Scanner", "What Is Concatenation", "Metods Sinntacks", "Java The Hutt"};
        String[] album_3Songs = {"Ain't No Time 4 That", "What is a Motorcycle Maaaade Of?", "Photocopier Initialize", "UNnamed"};
        String[] album_4Songs = {"Te Gustan Las Papas en tu Boca", "OH Nooo", "I Rather Not Say", "Scince Ruls"}; 
        //populate the corresponding
        for(int i = 0; i < 3; i++){
            allSongs[1][i] = album_1Songs[i];
            allSongs[2][i] = album_2Songs[i];
            allSongs[3][i] = album_3Songs[i];
            allSongs[4][i] = album_4Songs[i];

        }

        Albums album_1 = new Albums();
        album_1.album("Trump's special collection", "John Cena(ft. Snipars)", allSongs[1]);
        
        Albums album_2 = new Albums();
        album_2.album("Jaba Sinntacks", "James Gosling", allSongs[2]);
        
        Albums album_3 = new Albums();
        album_3.album("uTube Mixtapes", "Bill Gates(ft. Linus Torvald)", allSongs[3]);
        
        Albums album_4 = new Albums();
        album_4.album("Special rTunes Selections", "Head of Research and Development", allSongs[4]);
        
        
        allAlbums.add(album_1);
        allAlbums.add(album_2);
        allAlbums.add(album_3);
        allAlbums.add(album_4);
    }
        public static void runProgram(){
        Scanner userAnswer = new Scanner(System.in);
        System.out.println("Welcome to rTunes");
        System.out.println("Enter 1 to access the Albums");
        int answer_2 = userAnswer.nextInt();
        String[] nums = {"0: ", "1: ", "2: ", "3: ", "4: ", "5: ", "6:", "7:", "8:"};
        
        
        if(answer_2 == 1){
            
            
            int j;
            
            for(j = 0; j < allAlbums.size(); j++){
                String numeration = nums[j];
                System.out.println(numeration + allAlbums.get(j).name);
                }
            
            System.out.println(nums[j++] + "Add an Album");
            System.out.println(nums[j++] + "Delete an Album");
            int answer_3 = userAnswer.nextInt();

            if(answer_3 == k){
                        System.out.println("Album: " + allAlbums.get(0).name);
                        System.out.println("Artist: " + allAlbums.get(0).artist);
                        System.out.println("Songs: " + Arrays.toString(allAlbums.get(0).songs));
            }
            if(answer_3 == k+1){
                        System.out.println("Album: " + allAlbums.get(1).name);
                        System.out.println("Artist: " + allAlbums.get(1).artist);
                        System.out.println("Songs: " + Arrays.toString(allAlbums.get(1).songs));
            }
            if(answer_3 == k+2){
                        System.out.println("Album: " + allAlbums.get(2).name);
                        System.out.println("Artist: " + allAlbums.get(2).artist);
                        System.out.println("Songs: " + Arrays.toString(allAlbums.get(2).songs));
            }
            if(answer_3 == k+3){
                        System.out.println("Album: " + allAlbums.get(3).name);
                        System.out.println("Artist: " + allAlbums.get(3).artist);
                        System.out.println("Songs: " + Arrays.toString(allAlbums.get(3).songs));
            }
            if(answer_3 == k+4){
                addAlbum();
                        for(int t = 0; t < allAlbums.size(); t++){
                        String numeration = nums[t];
                        System.out.println(numeration+ allAlbums.get(t).name);}        
            }
            if(answer_3 == k+5){
                        deleteAlbum();
                        for(j = 0; j < allAlbums.size(); j++){
                        String numeration = nums[j];
                        System.out.println(numeration+ allAlbums.get(j).name);}
                        
            }            
                        

            System.out.println("Do you wish to terminate the program? \n 1: yes \n 2: no ");
            int answer_4 = userAnswer.nextInt();
            switch(answer_4){
                case 1: System.exit(0);
                    break;
                case 2: runProgram();    
                
            }
            
            
        }
        
        
        }
        public static void deleteAlbum(){
            Scanner input = new Scanner(System.in);
            System.out.println("Which album do you wish to delete?");
            int input_1 = input.nextInt();
            allAlbums.remove(input_1);
            allAlbums.trimToSize();
            
            System.out.println("The album has been deleted successfully" );
            
            k = k-1;
        }
        
        public static void addAlbum(){
System.out.println("\n ------------------------------------------------------------------ \n");
System.out.println("     ___                         ___           ___           ___"+   
"\n    /  /\\          ___          /  /\\         /  /\\         /  /\\"+   
"\n   /  /::\\        /__/\\        /  /::\\       /  /::\\       /  /::\\"+  
"\n  /__/:/\\:\\       \\  \\:\\      /  /:/\\:\\     /  /:/\\:\\     /  /:/\\:\\ "+
"\n _\\_ \\:\\ \\:\\       \\__\\:\\    /  /:/  \\:\\   /  /::\\ \\:\\   /  /::\\ \\:\\"+
"\n/__/\\ \\:\\ \\:\\      /  /::\\  /__/:/ \\__\\:\\ /__/:/\\:\\_\\:\\ /__/:/\\:\\ \\:\\"+
"\n\\  \\:\\ \\:\\_\\/     /  /:/\\:\\ \\  \\:\\ /  /:/ \\__\\/~|::\\/:/ \\  \\:\\ \\:\\_\\/"+
"\n \\  \\:\\_\\:\\      /  /:/__\\/  \\  \\:\\  /:/     |  |:|::/   \\  \\:\\ \\:\\"+ 
"\n  \\  \\:\\/:/     /__/:/        \\  \\:\\/:/      |  |:|\\/     \\  \\:\\_\\/"+ 
"\n   \\  \\::/      \\__\\/          \\  \\::/       |__|:|~       \\  \\:\\"+   
"\n    \\__\\/                       \\__\\/         \\__\\|         \\__\\/" ); 
System.out.println("\n ------------------------------------------------------------------ \n");


            double balance = 20.00;
            System.out.println("Your current balance is: " + balance);
            System.out.println("Please select the album you want to buy");
            System.out.println("1: Album_1, $9.99  \n2: Album_2, $11.99 \n3: Album_3, $100.99");
            Scanner addAnswer = new Scanner(System.in);
            int addInput = addAnswer.nextInt();
            
            if(addInput == 1){
                addAlbum_1();
                balance = balance - 9.99;
                
            }
            if(addInput == 2){
                addAlbum_2();
                balance = balance - 11.99;
            }
            if(addInput == 3){
                addAlbum_3();
                balance = balance - 100.99;
            }
            System.out.println("Your current balance is:" + balance);
            if(balance <0){
                System.out.println("You are forever in debt with rTunes and you shall pay with work");
            }
            
        }
        
        public static void addAlbum_1(){
            String[] album_5Songs = {"Science Rules!", "Inertia: a Property of Matter", "Bill! Bill! Bill!", "BowTies"};
            for(int i = 0; i < 3; i++){
                allSongs[5][i] = album_5Songs[i];
            }
            Albums album_5 = new Albums();
            album_5.album("Bill Nye: The Science Guy", "Bill Nye", allSongs[5]);
            allAlbums.add(album_5);
        }
        
        public static void addAlbum_2(){
            String[] album_6Songs = {"Much wow", "Spoder man", "PLS Don't steel", "Steal beams"};
            for(int i = 0; i < 3; i++){
                allSongs[6][i] = album_6Songs[i];
            }
            Albums album_6 = new Albums();
            album_6.album("The Internet of Memes", "Doge", allSongs[6]);
            allAlbums.add(album_6);
        }
        
        public static void addAlbum_3(){
            String[] album_7Songs = {"chorrisardd", "Billbosorerere", "Pikachu", "Sanic"};
            for(int i = 0; i < 3; i++){
                allSongs[7][i] = album_7Songs[i];
            }
            Albums album_7 = new Albums();
            album_7.album("Poker Mans", "Ash Kechup", allSongs[7]);
            allAlbums.add(album_7);
        }
        
        
    }
