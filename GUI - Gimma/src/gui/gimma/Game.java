/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.gimma;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;


/**
 *
 * @author Yi-hong
 * en Calvin
 */
public class Game {
    
    
    JFrame frame            = new JFrame("Game");
    JPanel panel            = new JPanel();
    JButton stop            = new JButton ("Stop");            
    JButton reset           = new JButton ("Reset");
   
    JPanel intro            = new JPanel();
    JButton start           = new JButton ("Start game");
    JButton exit            = new JButton ("exit");
    
    JPanel prologue         = new JPanel();
    JScrollPane scroll      = new JScrollPane();
    JTextArea text          = new JTextArea("Greetings, what is your name?" 
                     //   +  "\n\n(we have names for you if you cannot come up with one( ͡° ͜ʖ ͡°))" 
                        );
    JTextField input        = new JTextField();
    JButton submit          = new JButton("submit");   
    
    JPanel first            = new JPanel();
    JScrollPane scroll2     = new JScrollPane();
    JTextArea text2         = new JTextArea();
    JScrollPane statscroll  = new JScrollPane();
    JTextArea stats         = new JTextArea();
    JButton family          = new JButton ("Family");
    JButton villagers       = new JButton ("Some Villagers");
    JButton guards          = new JButton ("Local Guards");
    JButton nobody          = new JButton ("Nobody...");
    
    JPanel Family           = new JPanel();
    JScrollPane statscroll2 = new JScrollPane();
    JTextArea stats2        = new JTextArea();
    JScrollPane scroll3     = new JScrollPane();
    JTextArea text3         = new JTextArea();
    JButton next            = new JButton ("Continue");
    
    JPanel Villagers        = new JPanel();
    JScrollPane statscroll3 = new JScrollPane();
    JTextArea stats3        = new JTextArea();
    JScrollPane scroll4     = new JScrollPane();
    JTextArea text4         = new JTextArea();
    JButton next2            = new JButton ("Continue");
    
    JPanel Guards           = new JPanel();
    JScrollPane statscroll4 = new JScrollPane();
    JTextArea stats4        = new JTextArea();
    JScrollPane scroll5     = new JScrollPane();
    JTextArea text5         = new JTextArea();
    JButton next3            = new JButton ("Continue");
    
    JPanel Nobody           = new JPanel();
    JScrollPane statscroll5 = new JScrollPane();
    JTextArea stats5        = new JTextArea();
    JScrollPane scroll6     = new JScrollPane();
    JTextArea text6         = new JTextArea();
    JButton next4            = new JButton ("Continue");
    
    JPanel second           = new JPanel();
    JScrollPane statscroll6 = new JScrollPane();
    JTextArea stats6        = new JTextArea();
    JScrollPane scroll7     = new JScrollPane();
    JTextArea text7         = new JTextArea();    
    JButton serious         = new JButton ("I won’t let you do this, I’m going to stop you!");
    JButton grudge          = new JButton ("What is your grudge against my village?");
    JButton mercy           = new JButton ("Please spare us Bloodworth! We will do anything in return!");
    JButton stoopid         = new JButton ("Ragnor Bloodworth? Hahahaha what a dumb name!");
    
    JPanel third            = new JPanel();
    JScrollPane statscroll7 = new JScrollPane();
    JTextArea stats7        = new JTextArea();
    JScrollPane scroll8     = new JScrollPane();
    JTextArea text8         = new JTextArea();  
    
    JPanel fourth           = new JPanel();
    JScrollPane statscroll8 = new JScrollPane();
    JTextArea stats8        = new JTextArea();
    JScrollPane scroll9     = new JScrollPane();
    JTextArea text9         = new JTextArea();  
    
    CardLayout cl           = new CardLayout();
    
    public Game() {
        panel.setLayout(cl);   
        
        frame.add(panel);
            frame.setVisible(true);
            frame.setSize(1300,750);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
        
        intro.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        prologue.setLayout(new GridBagLayout());
        first.setLayout(new GridBagLayout());
        Family.setLayout(new GridBagLayout());
        Villagers.setLayout(new GridBagLayout());
        Guards.setLayout(new GridBagLayout());
        Nobody.setLayout(new GridBagLayout());
        second.setLayout(new GridBagLayout());
        third.setLayout(new GridBagLayout());
        fourth.setLayout(new GridBagLayout());
        
        
        
        //Section starting the code for the intro screen
        panel.add(intro, "intro");
            
        
        //Start button 
                c.gridx = 0;
                c.gridy = 0;
                c.ipadx = 60;
                c.ipady = 20;
                c.insets = new Insets(600,0,0,100);
            intro.add(start, c);
                     
            start.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    cl.show(panel, "prologue");        
                }
            }); 
             
            
        //Exit button    
                c.gridx = 1;
                c.ipadx = 100;
                c.ipady = 20;
                c.insets = new Insets(600,100,0,0);
            intro.add(exit, c);
                  
            exit.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    System.exit(0);
                    cl.show(panel, "intro");
                }
            });

        
        //Section starting the code for the prologue of the story 
        panel.add(prologue, "prologue");
                
        
        
        //Scrollpane with text
                c.gridx = 0;
                c.ipadx = 750;
                c.ipady = 450;
                c.insets = new Insets(0,0,215,485); 
                
            prologue.add(scroll, c);
                scroll.setViewportView(text);
                
                Border border = BorderFactory.createLineBorder(Color.BLACK);
                text.setBorder(
                        BorderFactory.createCompoundBorder(
                            border,
                            BorderFactory.createEmptyBorder(5,5,5,5)));
                text.setEditable(false);
                text.setEnabled(true);
                text.setWrapStyleWord(true);
                text.setLineWrap(true);
   
                
        //Input text field
                c.ipadx = 275;
                c.ipady = 10;
                c.insets = new Insets(350,0,0,975); 
            prologue.add(input, c);
                
            
        //Submit button    
                c.ipadx = 40;
                c.ipady = 5;
                c.insets = new Insets(425,0,0,1140);                 
            prologue.add(submit, c);
            
            submit.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    
                    if (input.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Please enter a valid name.");
                        return;
                    } else {
                    
                        String name = "You are a simple villager named " + input.getText() + "."
                        + "You live in Takitiko village, a simple farm village .\n" 
                        + "The last couple of nights you’ve had disturbing dreams where your village was left in ruins.\n"
                        + "There was one reoccuring thing in every single dream you had, a big "
                        + "humanoid-pig hybrid riding away on a black horse\n"
                        + "You decided to talk to ...... about these abnormal dreams.'\n \n"
                        + "<Choose an option on the right side of the textscreen to fill in the ... in the sentence.>'\n\n\n";
                        
                        text.setText(name);
                        text2.append(text.getText()); 
                        cl.show(panel, "first");
                        
                    }
                }
            });
            
            
            
            
            
            
        //Section starting the code for the first choice ofthe story     
        panel.add(first, "first");
        

        //Scrollpane2 with text2    
                c.ipadx = 750;
                c.ipady = 450;
                c.insets = new Insets(0,0,215,485); 
            first.add(scroll2, c);
                scroll2.setViewportView(text2);
                
                text2.setBorder(
                        BorderFactory.createCompoundBorder(
                            border,
                            BorderFactory.createEmptyBorder(5,5,5,5)));
                text2.setEditable(false);
                text2.setEnabled(true);
                text2.setWrapStyleWord(true);
                text2.setLineWrap(true);
                
                
        //Scrollpane of the stats with the stats displayed
                c.ipadx = 150;
                c.ipady = 190;
                c.insets = new Insets(485,0,0,1085); 
            first.add(statscroll, c);
                statscroll.setViewportView(stats);
                
                setText(stats, border);

                        
        //Family button
                c.ipadx = 155;
                c.ipady = 40;
                c.insets = new Insets(0,850,550,0); 
                family.setToolTipText("Telling your family is safe! right?");
            first.add(family, c);
            
            family.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                        text2.append(
                          "You decided to talk to your family, you explained your dreams and told your mother that "
                        + "you were afraid it would become reality. Your mother however reassured you that the dream"
                        + "could not become reality.\n"
                        + "You however did believe the dream, it felt too real to be a dream. The creeping and burning "
                        + "sensation after you woke up could not be reproduced by a regular dream.\n\n\n"
                        );
                        
                        text3.append(text2.getText()); 
                        cl.show(panel, "Family");
                        
                        JOptionPane.showMessageDialog(null, "Your Int has increased by 1 lvl!", "stat-up!", JOptionPane.INFORMATION_MESSAGE);
                    }
            });
            
            
        //Villagers button   
                c.ipadx = 105;
                c.ipady = 40;
                c.insets = new Insets(0,850,360,0); 
                villagers.setToolTipText("I hope they won't think I am crazy....");
            first.add(villagers, c);
            
            villagers.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){

                        text4.append(text2.getText()); 
                        cl.show(panel, "Villagers");
                    }
            });
        
            
        //Guards button
                c.ipadx = 115;
                c.ipady = 40;
                c.insets = new Insets(0,850,170,0); 
                guards.setToolTipText("I must warn them before it is too late ! ");
            first.add(guards, c);
            
            guards.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){

                        text5.append(text2.getText()); 
                        cl.show(panel, "Guards");
                    }
            });
        
            
        //Nobody button    
                c.ipadx = 140;
                c.ipady = 40;
                c.insets = new Insets(20,850,0,0); 
                nobody.setToolTipText("It is nothing you can't handel !");
            first.add(nobody, c);
            
            nobody.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){

                        text6.append(text2.getText()); 
                        cl.show(panel, "Nobody");
                    }
            });
        
            
            
            
            
        //Section starting the code after the choice Family     
        panel.add(Family, "Family");
        
        
        //Scrollpane3 with text3    
                c.ipadx = 750;
                c.ipady = 450;
                c.insets = new Insets(0,0,215,485); 
            Family.add(scroll3, c);
                scroll3.setViewportView(text3);
                
                text3.setBorder(
                        BorderFactory.createCompoundBorder(
                            border,
                            BorderFactory.createEmptyBorder(5,5,5,5)));
                text3.setEditable(false);
                text3.setEnabled(true);
                text3.setWrapStyleWord(true);
                text3.setLineWrap(true);
                
                
        //Scrollpane2 of the stats with updated stats displayed
                c.ipadx = 150;
                c.ipady = 190;
                c.insets = new Insets(485,0,0,1085); 
            Family.add(statscroll2, c);
                statscroll2.setViewportView(stats2);
                
                stats2.setBorder(
                        BorderFactory.createCompoundBorder(
                            border,
                            BorderFactory.createEmptyBorder(5,5,5,5)));
                stats2.setEditable(false);
                stats2.setEnabled(true);
                stats2.setWrapStyleWord(true);
                stats2.setLineWrap(true);
                stats2.setText(  "Stats: \n"
                        +       " Sta:  lvl 1 \n"
                        +       " Str:  lvl 1 \n"
                        +       " Int:  lvl 2 \n"
                        +       " Agi:  lvl 1 \n"
                        +       " Luk:  lvl 1 \n"
                        +       "     \n\n"
                        +       "Items: \n"
                        +       " Niggys magic flute\n\n");

                
        //Button to continue to the next part with the choice Family        
                c.ipadx = 115;
                c.ipady = 40;
                c.insets = new Insets(0,850,170,0); 
            Family.add(next, c);
            
            next.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    
                        text3.append(
                            "It’s getting late, and the opening of the festival is starting soon. As you walk in the "
                            + "streets you get an intense headache, and it feels like there is something dark and foul close to you.  "
                            + "When you’re walking through an alley you drop to the ground. You start seeing "
                            + "horrible visions of the festival and the people there, all dead or even worse. Then the images go up in"
                            + " flames and you find yourself in a dark empty space filled with flames\n\n" 
                            + "Then you hear a deep voice say: “Your village’s punishment is near, you will regret the day you all betrayed Ragnor Bloodworth!”\n\n\n"
                        );
                        
                        text7.append(text3.getText()); 
                        stats6.setText(stats2.getText());
                        cl.show(panel, "second");
                    }
            });
            
            
            
            
            
        //Section starting the code after the choice Villagers     
        panel.add(Villagers, "Villagers");
        
        
        //Scrollpane4 with text4    
                c.ipadx = 750;
                c.ipady = 450;
                c.insets = new Insets(0,0,215,485); 
            Villagers.add(scroll4, c);
                scroll4.setViewportView(text4);
                
                text4.setBorder(
                        BorderFactory.createCompoundBorder(
                            border,
                            BorderFactory.createEmptyBorder(5,5,5,5)));
                text4.setEditable(false);
                text4.setEnabled(true);
                text4.setWrapStyleWord(true);
                text4.setLineWrap(true);
                
                
        //Scrollpane3 of the stats with updated stats displayed
                c.ipadx = 150;
                c.ipady = 190;
                c.insets = new Insets(485,0,0,1085); 
            Villagers.add(statscroll3, c);
                statscroll3.setViewportView(stats3);
                
                setText(stats3, border);

                
        //Button to continue to the next part with the choice Villagers        
                c.ipadx = 115;
                c.ipady = 40;
                c.insets = new Insets(0,850,170,0); 
            Villagers.add(next2, c);
            
            next2.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    
                        text4.append(
                            "\nIt’s getting late, and the opening of the festival is starting soon. As you walk in the "
                            + "streets you get an intense headache, and it feels like there is something dark and foul close to you.  "
                            + "When you’re walking through an alley you drop to the ground. You start seeing "
                            + "horrible visions of the festival and the people there, all dead or even worse. Then the images go up in"
                            + " flames and you find yourself in a dark empty space filled with flames\n\n" 
                            + "Then you hear a deep voice say: “Your village’s punishment is near, you will regret the day you all betrayed Ragnor Bloodworth!”"
                        );
                        
                        text7.append(text4.getText()); 
                        stats6.setText(stats3.getText());
                        cl.show(panel, "second");
                    }
            });
        
            
            
            
            
        //Section starting the code after the choice Guards     
        panel.add(Guards, "Guards");
        
        
        //Scrollpane5 with text5    
                c.ipadx = 750;
                c.ipady = 450;
                c.insets = new Insets(0,0,215,485); 
            Guards.add(scroll5, c);
                scroll5.setViewportView(text5);
                
                text5.setBorder(
                        BorderFactory.createCompoundBorder(
                            border,
                            BorderFactory.createEmptyBorder(5,5,5,5)));
                text5.setEditable(false);
                text5.setEnabled(true);
                text5.setWrapStyleWord(true);
                text5.setLineWrap(true);
                
                
        //Scrollpane4 of the stats with updated stats displayed
                c.ipadx = 150;
                c.ipady = 190;
                c.insets = new Insets(485,0,0,1085); 
            Guards.add(statscroll4, c);
                statscroll4.setViewportView(stats4);
                
                setText(stats4, border);

                
        //Button to continue to the next part with the choice Guards        
                c.ipadx = 115;
                c.ipady = 40;
                c.insets = new Insets(0,850,170,0); 
            Guards.add(next3, c);
            
            next3.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    
                        text5.append(
                            "\nIt’s getting late, and the opening of the festival is starting soon. As you walk in the "
                            + "streets you get an intense headache, and it feels like there is something dark and foul close to you.  "
                            + "When you’re walking through an alley you drop to the ground. You start seeing "
                            + "horrible visions of the festival and the people there, all dead or even worse. Then the images go up in"
                            + " flames and you find yourself in a dark empty space filled with flames\n\n" 
                            + "Then you hear a deep voice say: “Your village’s punishment is near, you will regret the day you all betrayed Ragnor Bloodworth!”"
                        );
                        
                        text7.append(text5.getText()); 
                        stats6.setText(stats4.getText());
                        cl.show(panel, "second");
                    }
            });

            
            
            
            
        //Section starting the code after the choice Nobody     
        panel.add(Nobody, "Nobody");
        
        
        //Scrollpane6 with text6    
                c.ipadx = 750;
                c.ipady = 450;
                c.insets = new Insets(0,0,215,485); 
            Nobody.add(scroll6, c);
                scroll6.setViewportView(text6);
                
                text6.setBorder(
                        BorderFactory.createCompoundBorder(
                            border,
                            BorderFactory.createEmptyBorder(5,5,5,5)));
                text6.setEditable(false);
                text6.setEnabled(true);
                text6.setWrapStyleWord(true);
                text6.setLineWrap(true);
                
                
        //Scrollpane5 of the stats with updated stats displayed
                c.ipadx = 150;
                c.ipady = 190;
                c.insets = new Insets(485,0,0,1085); 
            Nobody.add(statscroll5, c);
                statscroll5.setViewportView(stats5);
                
                setText(stats5, border);

                
        //Button to continue to the next part with the choice Nobody
                c.ipadx = 115;
                c.ipady = 40;
                c.insets = new Insets(0,850,170,0); 
            Nobody.add(next4, c);
            
            next4.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    
                        text6.append(
                            "\nIt’s getting late, and the opening of the festival is starting soon. As you walk in the "
                            + "streets you get an intense headache, and it feels like there is something dark and foul close to you.  "
                            + "When you’re walking through an alley you drop to the ground. You start seeing "
                            + "horrible visions of the festival and the people there, all dead or even worse. Then the images go up in"
                            + " flames and you find yourself in a dark empty space filled with flames\n\n" 
                            + "Then you hear a deep voice say: “Your village’s punishment is near, you will regret the day you all betrayed Ragnor Bloodworth!”"
                        );
                        
                        text7.append(text6.getText()); 
                        stats6.setText(stats5.getText());
                        cl.show(panel, "second");
                    }
            });
            
            
            
            
            
        //Section starting the code after continue     
        panel.add(second, "second");
        
        
        //Scrollpane7 with text7    
                c.ipadx = 750;
                c.ipady = 450;
                c.insets = new Insets(0,0,215,485); 
            second.add(scroll7, c);
                scroll7.setViewportView(text7);
                
                text7.setMargin(new Insets(10,10,10,10));
                text7.setBorder(
                        BorderFactory.createCompoundBorder(
                            border,
                            BorderFactory.createEmptyBorder(5,5,5,5)));
                text7.setEditable(false);
                text7.setEnabled(true);
                text7.setWrapStyleWord(true);
                text7.setLineWrap(true);
                
                
        //Scrollpane6 of the stats with updated stats displayed
                c.ipadx = 150;
                c.ipady = 190;
                c.insets = new Insets(485,0,0,1085); 
            second.add(statscroll6, c);
                statscroll6.setViewportView(stats6);
                
                stats6.setBorder(
                        BorderFactory.createCompoundBorder(
                            border,
                            BorderFactory.createEmptyBorder(5,5,5,5)));
                stats6.setEditable(false);
                stats6.setEnabled(true);
                stats6.setWrapStyleWord(true);
                stats6.setLineWrap(true);
               
        
        //Serious button
                c.ipadx = 50;
                c.ipady = 40;
                c.insets = new Insets(0,800,550,0); 
                serious.setToolTipText("I will stop him, I am not letting him do whatever he wants!");
            second.add(serious, c);
            
            serious.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                       
                        cl.show(panel, "third");
                    }
            });
            
            
        //grudge button
                c.ipadx = 175;
                c.ipady = 40;
                c.insets = new Insets(0,800,360,0); 
                grudge.setToolTipText("What did the elders do, why is he telling ME all of this??!");
            second.add(grudge, c);
            
            grudge.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                       
                        cl.show(panel, "fourth");
                    }
            });
        
            
        //mercy button
                c.ipadx = 75;
                c.ipady = 40;
                c.insets = new Insets(0,800,170,0); 
                mercy.setToolTipText("I can't do anything... not for now at least...");
            second.add(mercy, c);
            
            mercy.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                       
                        cl.show(panel, "fourth");
                    }
            });
        
            
        //stoopid button
                c.ipadx = 5;
                c.ipady = 40;
                c.insets = new Insets(20,800,0,0); 
                stoopid.setToolTipText("Dat name tho, LMAO");
            second.add(stoopid, c);
            
            stoopid.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                       
                        cl.show(panel, "third");
                    }
            });
               
            
            
            
            
        //Section starting the code after last 4 buttons (test)
        panel.add(third, "third");
        
        //Scrollpane8 with text8    
                c.ipadx = 750;
                c.ipady = 450;
                c.insets = new Insets(0,0,215,485); 
            third.add(scroll8, c);
                scroll8.setViewportView(text8);
                
                text8.setBorder(
                        BorderFactory.createCompoundBorder(
                            border,
                            BorderFactory.createEmptyBorder(5,5,5,5)));
                text8.setEditable(false);
                text8.setEnabled(true);
                text8.setWrapStyleWord(true);
                text8.setLineWrap(true);
                text8.setText("How dare you to speak to me like that! I will burn your whole village and everything that you love you insolent little piece of sh*t!\n" +
"\n" +
"The flames in the dark space rise high and from behind you a fire whip strikes your back as it heavily burns it. “All of you will pay for what you’ve done to me, you will all tremble with fear when you see what happens soon!\n" +
"\n" +
"You wake up in the alley, your back hurts like crazy and you feel the burn wound is still there.\n" +
"You think this is the proof you need to get the higher ups to believe you! You quickly head to the village head and as you come into the room where some of the leaders are talking you scream: “Bloodworth is coming here anytime, and if you think I’m crazy here is the proof!” You take off your shirt and show the burn mark. “And I’m going to stop him!”\n" +
"\n" +
"You see the village head whisper in someone’s ear and he leaves the room. They ask you to explain it all and you do. They gather the troops and give you some as bodyguards. “We will clear the festival area quickly before he’s here!” said the troop commander.\n" +
"\n" +
"You all make haste to the festival area and as soon as you arrive and tell everyone to go into their homes for now a big flame portal opens on the stage and people scream and run in fear of this dark energy. A large Pig-man in dark steel armor and a big Warhammer steps out, followed by some mean looking Hell-Pigs. He screams: “WHERE IS THAT OLD GEEZER, I WILL HAVE HIS HEAD TONIGHT!!!");
                
        //Scrollpane7 of the stats with updated stats displayed
                c.ipadx = 150;
                c.ipady = 190;
                c.insets = new Insets(485,0,0,1085); 
            third.add(statscroll7, c);
                statscroll7.setViewportView(stats7);
                
                setText(stats7, border);
                
                
                //choice 2     
        panel.add(fourth, "fourth");
        
        //Scrollpane4 with text4    
                c.ipadx = 750;
                c.ipady = 450;
                c.insets = new Insets(0,0,215,485); 
            fourth.add(scroll9, c);
                scroll9.setViewportView(text9);
                
                text9.setBorder(
                        BorderFactory.createCompoundBorder(
                            border,
                            BorderFactory.createEmptyBorder(5,5,5,5)));
                text9.setEditable(false);
                text9.setEnabled(true);
                text9.setWrapStyleWord(true);
                text9.setLineWrap(true);
                text9.setText("How dare you to speak to me like that! I will burn your whole village and everything that you love you insolent little piece of sh*t!\n" +
"\n" +
"The flames in the dark space rise high and from behind you a fire whip strikes your back as it heavily burns it. “All of you will pay for what you’ve done to me, you will all tremble with fear when you see what happens soon!\n" +
"\n" +
"You wake up in the alley, your back hurts like crazy and you feel the burn wound is still there.\n" +
"You think this is the proof you need to get the higher ups to believe you! You quickly head to the village head and as you come into the room where some of the leaders are talking you scream: “Bloodworth is coming here anytime, and if you think I’m crazy here is the proof!” You take off your shirt and show the burn mark. “And I’m going to stop him!”\n" +
"\n" +
"You see the village head whisper in someone’s ear and he leaves the room. They ask you to explain it all and you do. They gather the troops and give you some as bodyguards. “We will clear the festival area quickly before he’s here!” said the troop commander.\n" +
"\n" +
"You all make haste to the festival area and as soon as you arrive and tell everyone to go into their homes for now a big flame portal opens on the stage and people scream and run in fear of this dark energy. A large Pig-man in dark steel armor and a big Warhammer steps out, followed by some mean looking Hell-Pigs. He screams: “WHERE IS THAT OLD GEEZER, I WILL HAVE HIS HEAD TONIGHT!");
                
                
        //Scrollpane3 of the stats with updated stats displayed
                c.ipadx = 150;
                c.ipady = 190;
                c.insets = new Insets(485,0,0,1085); 
            fourth.add(statscroll8, c);
                statscroll8.setViewportView(stats8);
                
                setText(stats8, border);
                

    }
    
    public void setText(JTextArea stat,Border border){
        stat.setBorder(
                        BorderFactory.createCompoundBorder(
                            border,
                            BorderFactory.createEmptyBorder(5,5,5,5)));
                stat.setEditable(false);
                stat.setEnabled(true);
                stat.setWrapStyleWord(true);
                stat.setLineWrap(true);
                stat.setText(  "Stats: \n"
                        +       " Sta:  lvl 1 \n"
                        +       " Str:  lvl 1 \n"
                        +       " Int:  lvl 1 \n"
                        +       " Agi:  lvl 1 \n"
                        +       " Luk:  lvl 1 \n"
                        +       "     \n\n"
                        +       "Items: \n"
                        +       " Niggys magic flute\n\n");
    }
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new Game();
                
             
            }
        });
        
    }    
}
