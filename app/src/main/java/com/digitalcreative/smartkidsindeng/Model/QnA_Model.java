package com.digitalcreative.smartkidsindeng.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by digitalcreative on 06/06/18.
 */

public class QnA_Model {
    public int gambar;
    public List<String> semuaJawaban; // distractors plus real answer
    public String jawaban;
    public String pertanyaan;
    public int selectedId = -1;

    public QnA_Model(Integer gambar, String pertanyaan, String jawaban, List<String> pengacau) {
        this.gambar = gambar;
        this.pertanyaan = pertanyaan;
        this.jawaban = jawaban;
        semuaJawaban = new ArrayList<String>(pengacau);

        // Add real answer to false answers and shuffle them around
        semuaJawaban.add(jawaban);
        Collections.shuffle(semuaJawaban);
    }

}
