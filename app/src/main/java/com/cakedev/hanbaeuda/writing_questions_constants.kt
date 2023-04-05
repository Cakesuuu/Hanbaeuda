package com.cakedev.hanbaeuda

import java.lang.Math.E

object ConstantsWriting{

    const val username: String = "@Username"
    const val total_questions: String = "Question_Total"
    const val score: String = "User_Score"

    fun getQuestions(): ArrayList<questions_data>{
        val questionsList = ArrayList<questions_data>()

        val que1 = questions_data(
            1,
            "How do you write \"An\" in Hangul?",
            "장", "안",
            "김", "조",
            2, "안"
        )
        questionsList.add(que1)

        val que2 = questions_data(
            2,
            "What sound does the letter ㅇ make when it is at the beginning of a syllable block?",
            "NG", "Silent",
            "K Sound", "N Sound",
            2, "Silent"
        )
        questionsList.add(que2)

        val que3 = questions_data(
            3,
            "What sound does the letter ㅇ make when it is at the end of a syllable block?",
            "H Sound", "A Sound",
            "NG Sound", "Silent",
            3, "NG Sound"
        )
        questionsList.add(que3)

        val que4 = questions_data(
            4,
                "What does the consonant \"ㄴ\" sounds similar to?",
            "N", "S",
            "L", "V",
            1, "N"
        )
        questionsList.add(que4)

        val que5 = questions_data(
            5,
            "How do you write \"Annyeonghaseyo\" (Hello) with Korean letters?",
            "겨드랑이", "안녕",
            "노래", "안녕하세요",
            4, "안녕하세요"
        )
        questionsList.add(que5)

        val que6 = questions_data(
            6,
            "What sound is the letter \"ㅋ\" similar to?",
            "Letter K", "Letter B",
            "Letter R", "Letter G",
            1, "Letter K"
        )
        questionsList.add(que6)

        val que7 = questions_data(
            7,
            "How do you write \"Norae\" (Music) in Korean?",
            "노라에", "노랴에",
            "노래", "도래",
            3, "노래"
        )
        questionsList.add(que7)

        val que8 = questions_data(
            8,
            "How do you write \"Samsung\" in Korean?",
            "삼손", "삼성",
            "닌자", "현대",
            2, "삼성"
        )
        questionsList.add(que8)

        val que9 = questions_data(
            9,
            "How do you write \"Jib\" (House) in Korean?",
            "집", "내",
            "잡", "딥",
            1, "집"
        )
        questionsList.add(que9)

        val que10 = questions_data(
            10,
            "How do you write \"Yeppeuda\" (Pretty) in Korean?",
            "아니오", "장원영",
            "아이브", "예쁘다",
            4, "예쁘다"
        )
        questionsList.add(que10)

        questionsList.shuffle()
        return questionsList

    }

}
