package memorygame;
import java.util.*;


public class TileControl {
   
    int circle1, circle2;
    int cross1, cross2;
    int diamond1, diamond2;
    int dice1 , dice2;
    int donut1, donut2;
    int eclipse1, eclipse2;
    int eclipse3, eclipse4;
    int grapes1, grapes2;
    int heart1, heart2;
    int L1, L2;
    int rectangle1, rectangle2;
    int snowflake1, snowflake2;
    int sqdonut1, sqdonut2;
    int square1, square2;
    int star1, star2;
    int tear1, tear2;
    int triangle1, triangle2;
    int X1, X2;
    
    
    int audio1, audio2;
    int headphone1, headphone2;
    int computer1, computer2;
    int laptop1, laptop2;
    int cpu1, cpu2;
    int gaming1, gaming2;
    int keyboard1, keyboard2;
    int mouse1, mouse2;
    int wireless1, wireless2;
    int smartphone1, smartphone2;
    
    
    int projector1 , projector2;
    int violin1, violin2;
    int trumpet1, trumpet2;
    int microphone1, microphone2;
    int saxophone1, saxophone2;
    int radio1, radio2;
    int musical1, musical2;
    int note1, note2;
    int mkeyboard1, mkeyboard2;
    int mphone1, mphone2;
    int slider1, slider2;
    int guitar1, guitar2;
    int drum1, drum2;
    int camera1, camera2;
    int notes1, notes2;
    
    
    
    //========================================================================================
    //          2X5 GAME BOARD TILE CONTROL
    //========================================================================================
    
    //generate random numbers & assign them to each shape twice.  its their location on the game board.
    public void initShuffle2x5Tiles(){
        int n = 0;

        //first add all the numbers from 0 to 15 into an array list, then shuffle it
        List<Integer> randomCollection = new ArrayList<>();
        for (int i = 0; i <= 9; i++){
            randomCollection.add(i); 
        }
        Collections.shuffle(randomCollection);

        //assign each shape their locations
        circle1 = randomCollection.get(n);
        n++;
        circle2 = randomCollection.get(n);
        n++;
        cross1 = randomCollection.get(n);
        n++;       
        cross2 = randomCollection.get(n);
        n++   ;   
        diamond1 = randomCollection.get(n);
        n++;
        diamond2 = randomCollection.get(n);
        n++; 
        donut1 = randomCollection.get(n);
        n++;
        donut2 = randomCollection.get(n);
        n++;
        eclipse1 = randomCollection.get(n);
        n++;
        eclipse2 = randomCollection.get(n);
        n++; 
        
    }
    
    //The type returned is a code from 0-7 that theoretically corresponds to a "shape". 
    //gives us some way of testing matches.
    public int get2x5TileType(int ID){
        int type = 100;
        
        System.out.print("Shape_Code: ");
        if (ID == circle1 || ID == circle2){
            type = 0;
            System.out.print(type + " - Circle");
        }
        else if (ID == cross1 || ID == cross2){
            type = 1;
            System.out.print(type + " - Cross");
        }
        else if (ID == diamond1 || ID == diamond2){
            type = 2;
            System.out.print(type + " - Diamond");
        }
        else if (ID == donut1 || ID == donut2){
            type = 3;
            System.out.print(type + " - Donut");
        }
        else if (ID == eclipse1 || ID == eclipse2){
            type = 4;
            System.out.print(type + " - Eclipse");
        }
        System.out.println();
        
        return type;
    }
    //========================================================================================
    //          4X5 GAME BOARD TILE CONTROL
    //========================================================================================
   
    //generate random numbers & assign them to each shape twice.  its their location on the game board.
    public void initShuffle4x5Tiles(){
        int n = 0;

        //first add all the numbers from 0 to 35 into an array list, then shuffle it.
        //then assign the value in slot 0 to a shape, etc etc. each shape gets a random value. 
        List<Integer> randomCollection = new ArrayList<>();
        for (int i = 0; i <= 19; i++){
            randomCollection.add(i); 
        }
        Collections.shuffle(randomCollection);

        
        audio1 = randomCollection.get(n);
        n++;
        audio2 = randomCollection.get(n);
        n++;
        headphone1 = randomCollection.get(n);
        n++;       
        headphone2 = randomCollection.get(n);
        n++   ;   
        computer1 = randomCollection.get(n);
        n++;
        computer2 = randomCollection.get(n);
        n++;
        laptop1 = randomCollection.get(n);
        n++;
        laptop2 = randomCollection.get(n);
        n++;
        cpu1 = randomCollection.get(n);
        n++;
        cpu2 = randomCollection.get(n);
        n++;
        gaming1 = randomCollection.get(n);
        n++;
        gaming2 = randomCollection.get(n);
        n++;
        keyboard1 = randomCollection.get(n);
        n++;
        keyboard2 = randomCollection.get(n);
        n++;
        mouse1 = randomCollection.get(n);
        n++;
        mouse2 = randomCollection.get(n);
        n++;
        wireless1 = randomCollection.get(n);
        n++;
        wireless2 = randomCollection.get(n);
        n++;
        smartphone1 = randomCollection.get(n);
        n++;
        smartphone2 = randomCollection.get(n);
        n++;
        
    }
    
    //The type returned is a code from 0-7 that theoretically corresponds to a "shape". 
    //gives us some way of testing matches.
    public int get4x5TileType(int ID){
        int type = 100;
        
        
        System.out.print("Shape_Code: ");
        if (ID == audio1 || ID == audio2){
            type = 0;
            System.out.print(type + " - AudioCard");
        }
        
        else if (ID == headphone1 || ID == headphone2){
            type = 1;
            System.out.print(type + " - HeadPhones");
        }
        else if (ID == computer1 || ID == computer2){
            type = 2;
            System.out.print(type + " - Computer");
        }
        else if (ID == laptop1 || ID == laptop2){
            type = 3;
            System.out.print(type + " - Laptop");
        }
        else if (ID == cpu1 || ID == cpu2){
            type = 4;
            System.out.print(type + " - CPU");
        }
        else if (ID == gaming1 || ID == gaming2){
            type = 5;
            System.out.print(type + " - Gaming");
        }
        else if (ID == keyboard1 || ID == keyboard2){
            type = 6;
            System.out.print(type + " - Keyboard");
        }
        else if (ID == mouse1 || ID == mouse2){
            type = 7;
            System.out.print(type + " - Mouse");
        }
        else if (ID == wireless1 || ID == wireless2){
            type = 8;
            System.out.print(type + " - Wireless");
        }
        else if (ID == smartphone1 || ID == smartphone2){
            type = 9;
            System.out.print(type + " - SmartPhone");
        }
        
        System.out.println();
        
        return type;
    }
    
    
    public void initShuffle6x5Tiles(){
        int n = 0;

        //first add all the numbers from 0 to 35 into an array list, then shuffle it.
        //then assign the value in slot 0 to a shape, etc etc. each shape gets a random value. 
        List<Integer> randomCollection = new ArrayList<>();
        for (int i = 0; i <= 29; i++){
            randomCollection.add(i); 
        }
        Collections.shuffle(randomCollection);
       
        projector1 = randomCollection.get(n);
        n++;
        projector2 = randomCollection.get(n);
        n++;
        violin1 = randomCollection.get(n);
        n++;       
        violin2 = randomCollection.get(n);
        n++   ;   
        trumpet1 = randomCollection.get(n);
        n++;
        trumpet2 = randomCollection.get(n);
        n++;
        microphone1 = randomCollection.get(n);
        n++;
        microphone2 = randomCollection.get(n);
        n++;
        saxophone1 = randomCollection.get(n);
        n++;
        saxophone2 = randomCollection.get(n);
        n++;
        radio1 = randomCollection.get(n);
        n++;
        radio2 = randomCollection.get(n);
        n++;
        musical1 = randomCollection.get(n);
        n++;
        musical2 = randomCollection.get(n);
        n++;
        note1 = randomCollection.get(n);
        n++;
        note2 = randomCollection.get(n);
        n++;
        mkeyboard1 = randomCollection.get(n);
        n++;
        mkeyboard2 = randomCollection.get(n);
        n++;
        mphone1 = randomCollection.get(n);
        n++;
        mphone2 = randomCollection.get(n);
        n++;
        slider1 = randomCollection.get(n);
        n++;
        slider2 = randomCollection.get(n);
        n++;
        guitar1 = randomCollection.get(n);
        n++;
        guitar2 = randomCollection.get(n);
        n++;
        drum1 = randomCollection.get(n);
        n++;
        drum2 = randomCollection.get(n);
        n++;
        camera1 = randomCollection.get(n);
        n++;
        camera2 = randomCollection.get(n);
        n++;
        notes1 = randomCollection.get(n);
        n++;
        notes2 = randomCollection.get(n);
        n++;
        
    }
    
    public int get6x5TileType(int ID){
        int type = 100;
        
        System.out.print("Shape_Code: ");
        if (ID == projector1 || ID == projector2){
            type = 0;
            System.out.print(type + " - Projector");
        }
        
        else if (ID == violin1 || ID == violin2){
            type = 1;
            System.out.print(type + " - Violin");
        }
        else if (ID == trumpet1 || ID == trumpet2){
            type = 2;
            System.out.print(type + " - Trumpet");
        }
        else if (ID == microphone1 || ID == microphone2){
            type = 3;
            System.out.print(type + " - Studio Microphone");
        }
        else if (ID == saxophone1 || ID == saxophone2){
            type = 4;
            System.out.print(type + " - Saxophone");
        }
        else if (ID == radio1 || ID == radio2){
            type = 5;
            System.out.print(type + " - Radio");
        }
        else if (ID == musical1 || ID == musical2){
            type = 6;
            System.out.print(type + " - MusicalScore");
        }
        else if (ID == note1 || ID == note2){
            type = 7;
            System.out.print(type + " - Note");
        }
        else if (ID == mkeyboard1 || ID == mkeyboard2){
            type = 8;
            System.out.print(type + " - Musical Keyboard");
        }
        else if (ID == mphone1 || ID == mphone2){
            type = 9;
            System.out.print(type + " - Microphone");
        }
        else if (ID == slider1 || ID == slider2){
            type = 10;
            System.out.print(type + " - Slider");
        }
        else if (ID == guitar1 || ID == guitar2){
            type = 11;
            System.out.print(type + " - Guitar");
        }
        else if (ID == drum1 || ID == drum2){
            type = 12;
            System.out.print(type + " - Drum");
        }
        else if (ID == camera1 || ID == camera2){
            type = 13;
            System.out.print(type + " - Camera");      
        }
        else if (ID == notes1 || ID == notes2){
            type = 14;
            System.out.print(type + " - Notes");
        }
        
        System.out.println();
        
        return type;
    }
    
    
    
}
