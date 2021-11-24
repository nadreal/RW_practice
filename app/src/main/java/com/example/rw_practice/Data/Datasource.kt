package com.example.rw_practice.Data

import com.example.rw_practice.Model.Rwmodel
import com.example.rw_practice.R

class Datasource {

    fun loadData():List<Rwmodel> {
        return listOf<Rwmodel>(
            Rwmodel(R.string.affirmation1),
            Rwmodel(R.string.affirmation2),
            Rwmodel(R.string.affirmation3),
            Rwmodel(R.string.affirmation4),
            Rwmodel(R.string.affirmation5),
            Rwmodel(R.string.affirmation6),
            Rwmodel(R.string.affirmation7),
            Rwmodel(R.string.affirmation8),
            Rwmodel(R.string.affirmation9),
            Rwmodel(R.string.affirmation10)
        )
    }
}
