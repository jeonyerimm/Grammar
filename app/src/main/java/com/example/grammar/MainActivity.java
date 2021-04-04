package com.example.grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

//private 상속 ㄴ 다른곳 ㄴ
//protected 상속 ㅇ 다른곳 ㄴ
//public 상속 ㅇ 다른곳 ㅇ

class Student1{

    //static 은 공용으로 사용함을 의미하는 키워드다. 보통 객체.xx 이렇게 쓰지않고, class.xx 라고 쓴다.
    //final 은 상수 -> 값이 변하지 않는 것 / 값을 쓸 수 없다.
    static final String schoolName = "sangju";
    static int number = 10;


    public int kor; // 멤버변수
    public int eng;

    //Overload : 함수 이름이 같지만, 함수의 파라미터가 달라서 알아서 구분해 주는 것을 의미함.
    // 생성자 : 이름이 같고, 리턴형을 생략
    public Student1(){

    }
    public Student1(int kor, int eng){
        this.kor = kor;
        this.eng = eng;

    }

    //멤버함수
    public int getAverage(){
        int sum = kor + eng;
        return sum/2;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "schoolName='" + schoolName + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", number=" + number +
                '}';
    }
};

class HighSchoolStudent extends Student1{
    private int science;

    public HighSchoolStudent(int kor, int eng, int science) {
        super(kor, eng);
        this.science = science;
    }

    //Override 재정의
    @Override
    public int getAverage() {
        int sum = this.kor + this.eng + this.science;
        return sum/3;
        //return super.getAverage();
    }



}
//
//class UniversityStudent extends HighSchoolStudent implements Person, {
//    private int society;
//
//}
//
////2중 상속은 안되지만,
////interface를 상솟 가능
////구현은 들어가있지 않고 선언만 되어있음
//
//interface Person{
//    int hetAverage();
//}
//
//interface Animal {
//    int getAverage();
//}




public class MainActivity extends AppCompatActivity {

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button)findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("yerim","hello world");
                //변수 :  값을 저장하는 공간

                //<primitive Type> (원시적인 기본형)

                //int : 정수형 (4byte)
                //boolean : true, false
                //char : 한글자  (1byte)
                //byte : 정수형 (1byte)
                //short : 정수형 (2byte)
                //long : 정수형 (8byte)
                //float : 소수형 (4)
                //double : 소수형 (8)


                int score = 100;
                Log.d("yerim","score = " + score);
                boolean isYerim = true;
                if(isYerim){
                    Log.d("yerim","ok = " + isYerim);
                } else {
                    Log.d("yerim","not ok = " + isYerim);
                }

                int kor = 80;
                int math = 77;
                int eng = 69;
                int sum = kor + math + eng;
                float average = (float) sum/3;
                Log.d("yerim","average = " + average);

                // 타입 캐스팅 : 타입 변경
                //int->float 변경을 하고자 한다면, (float)sum 처럼 앞에 (float)붙여준다.

                String strText = "hello world";
                char ch =  strText.charAt(4);
                Log.d("yerim","ch = " + ch);









                //<Reference type> (참조형)

                //String, class, array ...
                String strText1 = new String("hello world");
                //Sting 에서 +
                //"hello" + "world" => "helloworld" : concat
                //문자열 + 정수 => 문자열
                Log.d("yerim","strText1 = " +  strText1);
                int [] arr = new int[4];
                arr[0] = 10;
                arr[1] = 20;
                arr[2] = 30;
                arr[3] = 40;


                for (int i =0; i< arr.length; i++){
                    Log.d("yerim","arr[] = " + arr[i]);
                }

                int[] arr2 = {10,20,30,40};

                for(int i=0;i<arr2.length;i++){
                    Log.d("yerim","arr2[] = " + arr2[i]);
                }

                int [][] matrix = new int [5][5];
                int count = 0;
                for(int i=0; i<5;i++){
                    for(int j=0;j<5;j++){
                        matrix[i][j] = count++;
                        Log.d("yerim","matrix[i][j] = " + matrix[i][j]);
                    }
                }





                class Student {
                    int kor;
                    int math;
                    int eng;

                    @Override
                    public String toString() {
                        return "Student{" +
                                "kor=" + kor +
                                ", math=" + math +
                                ", eng=" + eng +
                                '}';
                    }

                    public Student(){

                    }
                    public Student(int kor, int math, int eng){
                        this.kor = kor;
                        this.math = math;
                        this.eng = eng;
                    }
                }

                Student [] students = new Student[3];
                students[0]=new Student();
                students[0].kor = 100;
                students[0].math = 100;
                students[0].eng = 100;

                students[1]=new Student();
                students[1].kor = 100;
                students[1].math = 100;
                students[1].eng = 100;

                students[2]=new Student();
                students[2].kor = 100;
                students[2].math = 100;
                students[2].eng = 100;

                for(int i=0; i<students.length; i++){
                    Log.d("yerim","students[i] =" + students[i]);
                }

                Student[] students2 = {
                        new Student(100,100,100),
                        new Student(90,90,90),
                        new Student(80,80,80),
                };
                for(int i=0; i<students2.length; i++) {
                    Log.d("yerim", "students2[i] =" + students2[i]);
                }


                Student student = new Student();
                student.kor = 100;
                student.math = 70;
                student.eng = 80;

                Log.d("yerim", "student = " + student);




                //----
                //연산자
                //+ = * /(몫) %(나머지) (모듈러 : 나머지)

                int a = 10;
                int b = a / 3;
                int c = a % 3;
                Log.d("yerim","b = " + b + ",c = " + c);

                //++ --
                //++ >>>> count = count + 1 , count += 1
                //count /= count = count / 2

                int count2 = 0;
                while(true){
                    if(count2 > 10){
                        break;
                    }
                    Log.d("yerim","count2 = " + count2++);
                }

                Log.d("yerim","=========================================");

                count2 = 0;
                while(true){
                    if(count2 > 10){
                        break;
                    }
                    Log.d("yerim","count2 = " + (++count2));
                }

                //비교연산자
                // > < <= >= == !=
                //논리연산자
                //%% : and
                //|| : or

                //삼항연산자
                // ? :
                int value1 = true ? 3 : 5;
                int value2 = false ? 3 : 5;

//                int value1 = true ? 3 : 5;
//                if(true) {
//                    value1 = 3;
//                }else{
//                    value2 = 5;
//                }

                Log.d("yerim", "value1 = " + value1);
                Log.d("yerim", "value2 = " + value2);

                //if switch for while do while

                int value3 = 100;
                if(value3 ==100){
                    Log.d("yerim", "ok value3 = " + value3);
                }else {
                    Log.d("yerim", "not ok value3 = " + value3);
                }


                Log.d("yerim", "==============");
                value3 = 30;
                switch(value3){
                    case 1 :
                        Log.d("yerim", "case 1");
                        break;
                    case 2 :
                        Log.d("yerim", "case 2");
                        break;
                    case 30 :
                        Log.d("yerim", "case 30");
                        break;
                    default:
                        Log.d("yerim", "etc");
                        break;

                }
                Log.d("yerim", "==============");




                for(int i = 0;i<10;i++){
                    Log.d("yerim", "i = " +i);
                }

                Log.d("yerim", "==============");
                int i = 0;
                while(i<10){
                    i++;
                    Log.d("yerim", "i = " +i);
                }

                //break 는 자기 자신의 for loop 문을 빠져나온다.

                Log.d("yerim", "==============");
                count = 0;
                do {
                    count++;
                    Log.d("yerim","count = " + count);
                }while(count<10);







                //class 는 단순 정의다.
                //활용을 하려면 객체를 만들어서 사용한다. 객체는 변수라고 생각하면 된다.
                Student1 student1 = new Student1();
                Student1 student2 = new Student1(100,100);
                Log.d("yerim","average = " + student2.getAverage());

                //scope : private public default protected

                HighSchoolStudent highSchoolStudent = new HighSchoolStudent(100,80,80);
                Log.d("yerim","average = " + highSchoolStudent.getAverage());



                Student1 student3 = new Student1(100,100);
                Student1.number = 33;
                Log.d("yerim","student3 = " + student3);

                Student1 student4 = new Student1(80,70);
                Student1.number = 55;
                Log.d("yerim","student3 = " + student3);
                Log.d("yerim","student4 = " + student4);



            }


        });
    }
}