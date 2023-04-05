package com.cakedev.hanbaeuda

object ConstantsReading{

    const val username: String = "@Username"
    const val total_questions: String = "Question_Total"
    const val score: String = "User_Score"
    const val test: String = "Test"

    fun getQuestions(): ArrayList<questions_data>{
        val questionsList = ArrayList<questions_data>()

        val que1 = questions_data(
            1,
            "How do you read \n\"안녕하세요\" (Hello)?",
            "Hyun-Dai", "Ye-Ppeo-Seo",
            "Sam-Sung", "An-Nyeong-Ha-Se-Yo",
            4, "An-Nyeong-Ha-Se-Yo"
        )
        questionsList.add(que1)

        val que2 = questions_data(
            2,
            "Batchim is found in what part of a syllable block?",
            "Start/Beginning", "Middle-Part",
            "Last/Ending", "Start/End",
            3, "Last/Ending"
        )
        questionsList.add(que2)

        val que3 = questions_data(
            3,
            "How do you read \n\"감사해요\" (Thank you)?",
            "Kam-Sa-Hae-Yo", "An-Nyeong-Ha-Se-Yo",
            "A-Ri-Ga-To", "Ga-Bang",
            1, "Kam-Sa-Hae-Yo"
        )
        questionsList.add(que3)

        val que4 = questions_data(
            4,
            "How do you read \n\"토마토\" in Korean?",
            "Ba-Na-Na", "To-Ma-To",
            "Ga-Ra-Pa-Ta", "Se-Ven-Teen",
            2, "To-Ma-To"
        )
        questionsList.add(que4)

        val que5 = questions_data(
            5,
            "How do you read \n\"아이스크림\" in Korean?",
            "Ice Cream", "McDonalds",
            "Manila Zoo", "Starbucks",
            1, "Ice Cream"
        )
        questionsList.add(que5)

        val que6 = questions_data(
            6,
            "How do you read \n\"튀터\" in Korean?",
            "Facebook", "Kakaotalk",
            "Twitter", "Youtube",
            3, "Twitter"
        )
        questionsList.add(que6)

        val que7 = questions_data(
            7,
            "How do you read \n\"스마트폰\" in Korean?",
            "Air-con", "Godzilla",
            "Rubber Shoes", "Smartphone",
            4, "Smartphone"
        )
        questionsList.add(que7)

        val que8 = questions_data(
            8,
            "How do you read \n\"저는\" (Me / I)?",
            "Jeo-neun", "An-Nyeong",
            "Gin-Jang-Dwen-Da", "Hang-Bok-Hae",
            1, "Jeo-neun"
        )
        questionsList.add(que8)

        val que9 = questions_data(
            9,
            "How do you read \n\"행복해\" (Happy)?",
            "Jib", "Ppal-Ri",
            "Gong-Bu", "Haeng-Bok-Hae",
            4, "Haeng-Bok-Hae"
        )
        questionsList.add(que9)

        val que10 = questions_data(
            10,
            "How do you read \n\"빨리\" (Hurry)?",
            "Hak-Saeng", "Joh-A-Hae-Yo",
            "Ppal-Ri", "Pi-Gon-Hae",
            3,"Ppal-Ri"
        )
        questionsList.add(que10)

        questionsList.shuffle()
        return questionsList

    }
}
