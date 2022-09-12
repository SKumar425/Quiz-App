package com.example.myquizapp

object Constants {

    const val USER_NAME :String="user_name"
    const val TOTAL_QUESTION:String="total_question"
    const val CORRECT_ANSWER:String="correct_answer"

    fun getQuestions():ArrayList<Questions>{
        val questionList=ArrayList<Questions>()

        val que1=Questions(
            1,"What country does this flag belong to ?",
             R.drawable.argentina,
            "Argentina","Australia","Armenia","Austria",
            1


        )
        questionList.add(que1)

        val que2=Questions(
            2,"What country does this flag belong to ?",
            R.drawable.australia,
            "Argentina","Australia","Armenia","Austria",
            2


        )
        questionList.add(que2)

        val que3=Questions(
            3,"What country does this flag belong to ?",
            R.drawable.brazil,
            "Argentina","Australia","Brazil","Austria",
            3


        )
        questionList.add(que3)

        val que4=Questions(
            4,"What country does this flag belong to ?",
            R.drawable.india,
            "India","Australia","Armenia","Austria",
            1


        )
        questionList.add(que4)

        val que5=Questions(
            5,"What country does this flag belong to ?",
            R.drawable.denmark,
            "Argentina","Australia","Denmark","Austria",
            3


        )
        questionList.add(que5)

        val que6=Questions(
            6,"What country does this flag belong to ?",
            R.drawable.kuwait,
            "Argentina","Australia","Kuwait","Austria",
            3


        )
        questionList.add(que6)


        val que7=Questions(
            7,"What country does this flag belong to ?",
            R.drawable.fiji,
            "Argentina","Australia","Kuwait","Fiji",
            4


        )
        questionList.add(que7)

        val que8=Questions(
            8,"What country does this flag belong to ?",
            R.drawable.usa,
            "USA","India","Kuwait","Fiji",
            1


        )
        questionList.add(que8)


        val que9=Questions(
            9,"What country does this flag belong to ?",
            R.drawable.afganistan,
            "USA","Afghanistan","Pakistan","Fiji",
            2


        )
        questionList.add(que9)

        val que10=Questions(
            10,"What country does this flag belong to ?",
            R.drawable.algeria,
            "USA","Qatar","Pakistan","Algeria",
            4


        )
        questionList.add(que10)

        val que11=Questions(
            11,"What country does this flag belong to ?",
            R.drawable.andorra,
            "Andorra","Afghanistan","Pakistan","Fiji",
            1


        )
        questionList.add(que11)

        val que12=Questions(
            12,"What country does this flag belong to ?",
            R.drawable.armania,
            "Armani","Afghanistan","Pakistan","Fiji",
            1


        )
        questionList.add(que12)


        val que13=Questions(
            13,"What country does this flag belong to ?",
            R.drawable.austria,
            "USA","Afghanistan","Austria","India",
            3


        )
        questionList.add(que13)

        val que14=Questions(
            14,"What country does this flag belong to ?",
            R.drawable.bahamas,
            "USA","Bahamas","India","Fiji",
            2


        )
        questionList.add(que14)

        val que15=Questions(
            15,"What country does this flag belong to ?",
            R.drawable.bahrain,
            "USA","Bahamas","India","Bahrain",
            4


        )
        questionList.add(que15)


        val que16=Questions(
            16,"What country does this flag belong to ?",
            R.drawable.canada,
            "Canada","Bahamas","India","Bahrain",
            1


        )
        questionList.add(que16)

        val que17=Questions(
            17,"What country does this flag belong to ?",
            R.drawable.newzealand,
            "USA","Bahamas","India","NewZealand",
            4


        )
        questionList.add(que17)

        val que18=Questions(
            18,"What country does this flag belong to ?",
            R.drawable.swizerland,
            "Switzerland","Bahamas","India","Qatar",
            1


        )
        questionList.add(que18)

        val que19=Questions(
            19,"What country does this flag belong to ?",
            R.drawable.yemen,
            "Bahamas","Turkey","Yemen","Bahrain",
            3


        )
        questionList.add(que19)

        val que20=Questions(
            20,"What country does this flag belong to ?",
            R.drawable.zimbabwe,
            "Zimbabwe","Bahamas","India","Bahrain",
            1


        )
        questionList.add(que20)





        return questionList
    }
}