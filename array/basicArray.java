package array;

// class inhancedForLoop{
//     public int add(int num1[][]){
//         for(int n[]:num1){
//             for(int m:n){
//                 System.out.print(m+" ");
//             }
//             System.out.println();
//         }
//         return 0;
//     }
// }

class Student{
    int age;
    String name;
    int marks;
}
public class basicArray {
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.age = 17;
       s1.name = "Ankush";
       s1.marks = 99;

       Student s2 = new Student();
       s2.age = 17;
       s2.name = "Ankush";
       s2.marks = 99;

       Student s3 = new Student();
       s3.age = 17;
       s3.name = "Ankush";
       s3.marks = 99;

       Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;
        
       for(int i=0; i<student.length; i++){
            System.out.print("Age" + student[i].age );
       }

       
    }    
}
