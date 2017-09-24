import javax.swing.JOptionPane;
public class AverageScore {

    public static void main(String[] args) {
        //Declare variables to hold user input
                String input1, input2, input3;

                //Declare variables to store converted user input
                double score1; //hold score#1
                double score2; //hold score#2
                double score3; //hold score#3
                double average; //hold the average score


                //get the first test score.
                input1 = JOptionPane.showInputDialog(null, "Enter score #1:");
                

                //get the second test score.
                input2 = JOptionPane.showInputDialog(null, "Enter score #2:");
               

                //get the third test score.
                input3 = JOptionPane.showInputDialog("Enter score #3:");
                

                //Convert test scores to data type double
                score1 = Double.parseDouble(input1);
                score2 = Double.parseDouble(input2);
                score3 = Double.parseDouble(input3);

                //calculate the average score.
                average = (score1 + score2 + score3) / 3.0;

                //Display the average score.
                JOptionPane.showMessageDialog(null,
                                        "The average is " + average);

                //Letter grade that corresponds to average

                if (average <= 100){
                    if(average >= 90){
                            JOptionPane.showMessageDialog(null, "Your average is " + average + " or A");
                        }
                      else if(average >= 80){
                            JOptionPane.showMessageDialog(null, "Your average is " + average + " or B");
                        }
                      else if(average >= 70){
                            JOptionPane.showMessageDialog(null, "Your average is " + average + " or C");
                        }
                      else if(average >= 60){
                            JOptionPane.showMessageDialog(null, "Your average is " + average + " or D");
                        }
                      else if(average < 60) {
                            JOptionPane.showMessageDialog(null, "Your average is " + average + " or F");
                        }
                }


                System.exit(0);
    }
    
}
