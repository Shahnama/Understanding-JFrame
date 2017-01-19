
package javajframeunderstanding;

public class JavaJFrameUnderstanding 
{
    static JFrameByClassExtends mFrame;
    
    public static void main(String[] args) 
    {
        mFrame =  new JFrameByClassExtends();
        
        mFrame.addComponentListener(mFrame);
                
        /*
        mFrame.addComponentListener(new ComponentAdapter() 
        {  
            public void componentResized(ComponentEvent evt) 
            {
                // Component c = (Component)evt.getSource();
               // System.out.println("Happend");
                mFrame.myLabel.setBounds((mFrame.getSize().width/2) - (mFrame.labelPreferredSize.width /2) ,( mFrame.getSize().height / 2) - (mFrame.labelPreferredSize.height /2),
                    
                mFrame.labelPreferredSize.width, mFrame.labelPreferredSize.height);
            }
        });
        */
        mFrame.valuePrint();
    }
    

    
}
