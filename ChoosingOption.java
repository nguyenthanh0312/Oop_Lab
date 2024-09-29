import javax.swing.JOptionPane;
public class ChoosingOption {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null,"Do you want to change to the first class ticket?");
		JOptionPane.showMessageDialog(null,"You've chosen: " + (option==JOptionPane.YES_OPTION?"Yes":"No"));
		System.exit(0);
	}
}
//Khi mà người dùng nhấn "cancel" thì sẽ không làm gì cả ngoài việc bỏ qua việc lưu các thay đổi và không thực thi chương trình
//Cách tạo các câu trả lời khác của người dùng
// import javax.swing.JOptionPane;

// public class CustomOptionsExample {
//     public static void main(String[] args) {
//         // Option 1: "Yes" and "No"
//         int response1 = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
//                 JOptionPane.YES_NO_OPTION);

//         if (response1 == JOptionPane.YES_OPTION) {
//             System.out.println("User chose Yes.");
//         } else {
//             System.out.println("User chose No.");
//         }

//         // Option 2: "I do" and "I don't"
//         Object[] options = {"I do", "I don't"};
//         int response2 = JOptionPane.showOptionDialog(null, 
//                 "Will you be attending the event?", 
//                 "Event Attendance", 
//                 JOptionPane.YES_NO_OPTION, 
//                 JOptionPane.QUESTION_MESSAGE, 
//                 null, 
//                 options, 
//                 options[0]); // Default selection

//         if (response2 == 0) {
//             System.out.println("User chose I do.");
//         } else {
//             System.out.println("User chose I don't.");
//         }
//     }
// }
