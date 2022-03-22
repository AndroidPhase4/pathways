package com.Phase4.pathways.data

import com.Phase4.pathways.R
import com.Phase4.pathways.model.Bootcamp

class Datasource {
    fun loadBootcamps() : List<Bootcamp> {
        return listOf<Bootcamp>(
            Bootcamp(R.string.bootcamp1, R.string.bootcamp1Desc, R.drawable.app_academy),
            Bootcamp(R.string.bootcamp2, R.string.bootcamp2Desc, R.drawable.app_academy)
        )
    }

}