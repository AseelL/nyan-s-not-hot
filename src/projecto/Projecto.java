package projecto;

import javax.swing.JOptionPane;

public class Projecto {

    public static void main(String[] args) {
        int c = 0;
        int[][] marks = new int[3][100];
        int count = 0;
        int ma = 0;
        int mi = 0;
        double max = 0;
        double min = 0;
        double sum = 0;
        double[] avg = new double[100];
        String result = " ";
        String search = " ";
        String[] names = new String[100];
        String report = " ";
        String main = "1- input student data\n"
                + "2- print all entered data\n"
                + "3- print a specific student's data\n"
                + "4- search a name\n"
                + "5- find highest avg\n"
                + "6- find lowest avg\n"
                + "7- highest score in arabic subject\n"
                + "8- E X I T \n";
        while (c == 0) {
            int n = Integer.parseInt(JOptionPane.showInputDialog("please enter your choice :\n" + main));

            switch (n) {
                case 1:
                    names[count] = JOptionPane.showInputDialog("Enter student's name: ");
                    sum = 0;
                    for (int j = 0; j < 3; j++) {
                        marks[count][j] = Integer.parseInt(JOptionPane.showInputDialog("Enter mark number " + (j + 1) + ":"));
                        sum += marks[count][j];
                    }
                    avg[count] = (sum / 3);
                    count++;
                    break;
                case 2:
                    for (int i = 0; i < count; i++) {
                        report += names[i] + "    ";
                        for (int j = 0; j < 3; j++) {
                            report += marks[i][j] + "    ";
                        }
                        report += avg[i] + "\n";
                    }
                    JOptionPane.showMessageDialog(null, report);
                    report = " ";

                    break;
                case 3:
                    search = JOptionPane.showInputDialog("Please enter student's name: ");
                    for (int i = 0; i < count; i++) {
                        if (names[i].equals(search)) {
                            result += names[i] + "   " + marks[i][0] + "  " + marks[i][1] + "  " + marks[i][2] + "  " + avg[i];
                            JOptionPane.showMessageDialog(null, result);
                        } else {
                            JOptionPane.showMessageDialog(null, "This student doesn't exist, please try again");
                        }
                    }

                    break;
                case 4:
                    /*]*/

                    break;

                case 5:
                    for (int i = 0; i < avg.length; i++) {
                        if (avg[i] > max) {
                            max = avg[i];
                        }
                        ma = i;
                    }
                    JOptionPane.showMessageDialog(null, "the highest avg is " + max + " for St. " + names[ma]);
                    break;

                case 6:
                    for (int i = 0; i < avg.length; i++) {
                        if (avg[i] < min) {
                            max = avg[i];
                        }
                        mi = i;
                    }
                    JOptionPane.showMessageDialog(null, "the highest avg is " + min + " for St. " + names[mi]);

                    break;

                case 7:

                    break;

                case 8:

                    c = 1;

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "your choice doesn't exist, please try again ");
            }

        }
    }

    /* int[]meow=new int[2];
         for(int i=0;i<meow.length;i++)
         meow[i]=Integer.parseInt(JOptionPane.showInputDialog("meow me with a number!"));
     */
}
