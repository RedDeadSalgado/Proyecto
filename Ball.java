package proyecto;
import javax.swing.*;
public class Ball extends Thread{
    private PanelBall panel;
    private Mix x;
    private Miy y;
    public boolean nor = false;
    public boolean sur = false;
    public boolean est = false;
    public boolean oes = true;
    Ball(PanelBall panel, Mix x, Miy y){
        this.panel=panel;
        this.x=x;
        this.y=y;
    }
    public void run(){
        while(true){
                System.out.println(x.getX() + "-" + y.getY () +  "Ban:" + nor + "-" + sur  +  "-" + est + "-" + oes);
                if(x.getX() > 640){
                    est = true;
                    nor = false;
                    oes = false;
                    sur = false;
                }
                if(x.getX()< -30){
                    oes = true;
                    nor = false;
                    est = false;
                    sur = false;
                }
                if(y.getY()<0){
                    nor = true;
                    est = false;
                    oes = false;
                    sur = false;
                }
                if(y.getY()>500){
                    sur = true;
                    nor = false;
                    oes = false;
                    est = false;
                }
                if(nor == true){
                    try{
                        x.setX(x.getX()-5); //x=x+10
                        y.setY(y.getY()+5); //y=y+10
                        panel.repaint();
                        Ball.sleep(100);
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
                if(sur == true){
                     try{
                        x.setX(x.getX()+5); //x=x+10
                        y.setY(y.getY()-5); //y=y+10
                        panel.repaint();
                        Ball.sleep(100);
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
                if(est == true){
                    try{
                        x.setX(x.getX()-5); //x=x+10
                        y.setY(y.getY()-5); //y=y+10
                        panel.repaint();
                        Ball.sleep(100);
                     }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
                if(oes == true){
                     try{
                        x.setX(x.getX()+5); //x=x+10
                        y.setY(y.getY()+5); //y=y+10
                        panel.repaint();
                        Ball.sleep(100);
                     }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
                
            }
        }
    }


