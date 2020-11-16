package com.example.myquiz;

public class Question {
    public String questions[]={
            "Which country on 14 July 2020 has banned China’s Huawei 5G equipment?",
            "Which of the following is not a programming language?",
            "Which of the following is not a stable sorting algorithm?",
            "Which of the following is a stable sorting algorithm?",
            "Which of the following is not an in-place sorting algorithm?",
            "If the given input array is sorted or nearly sorted, which of the following algorithm gives the best performance?",
            "Which of the following algorithm pays the least attention to the ordering of the elements in the input list?",
            "Which of the following algorithms has lowest worst case time complexity?",
            " Given a number of elements in the range [0….n3]. which of the following sorting algorithms can sort them in O(n) time?",
            "The radix sort does not work correctly if each individual digit is sorted using"

    };
    public String[][] options ={
            {"America","Canada","United Kingdom","Indonesia"},
            {"HTML","PHP","Python","C++"},
            {"Insertion Sort","Heap Sort","Bubble Sort","Selection Sort"},
            {"Merge Sort","Heap Sort","Selection Sort","Quick Sort"},
            {"Selection Sort","Heap Sort","Merge Sort","Quick Sort"},
            {"Insertion Sort","Selection Sort","Quick Sort","Merge Sort"},
            {"Insertion Sort","Selection Sort","Quick Sort","None"},
            {"Insertion Sort","Selection Sort","Quick Sort","Heap Sort"},
            {"Heap Sort","Merge Sort","Quick Sort","Radix Sort"},
            {"Counting Sort","Insertion Sort","Selection Sort","Bubble Sort"}




    };
    public String correctAnswers[]={
            "United Kingdom","HTML","Selection Sort","Merge Sort","Merge Sort","Insertion Sort",
            "Selection Sort","Selection Sort","Radix Sort","Selection Sort"
    };
    public String getQuestion(int a){
        String question=questions[a];
        return question;
    }
    public String getoption1(int a){
        String option=options[a][2];
        return option;

    }
    public String getoption2(int a){
        String option=options[a][0];
        return option;

    }
    public String getoption3(int a){
        String option=options[a][3];
        return option;

    }
    public String getoption4(int a){
        String option=options[a][0];
        return option;

    }
    public String getoption5(int a){
        String option=options[a][2];
        return option;

    }
    public String getoption6(int a){
        String option=options[a][0];
        return option;

    }
    public String getoption7(int a){
        String option=options[a][1];
        return option;

    }
    public String getoption8(int a){
        String option=options[a][1];
        return option;

    }
    public String getoption9(int a){
        String option=options[a][3];
        return option;

    }
    public String getoption10(int a){
        String option=options[a][2];
        return option;

    }
    public String getCorrectAnswer(int a){
        String answer=correctAnswers[a];
        return answer;
    }
}
