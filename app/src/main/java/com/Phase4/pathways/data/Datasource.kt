package com.Phase4.pathways.data

import com.Phase4.pathways.R
import com.Phase4.pathways.models.Bootcamp

class Datasource() {

    fun loadBootcamps(): List<Bootcamp> {
        return listOf<Bootcamp>(
            Bootcamp(R.string.bootcamp1, R.drawable.app_academy, R.string.bootcamp1Desc, R.string.bootcamp1Url),
            Bootcamp(R.string.bootcamp2, R.drawable.fullstack_academy,R.string.bootcamp2Desc, R.string.bootcamp2Url),
            Bootcamp(R.string.bootcamp3, R.drawable.hack_reactor, R.string.bootcamp3Desc, R.string.bootcamp3Url),
            Bootcamp(R.string.bootcamp4, R.drawable.flatiron_school, R.string.bootcamp4Desc, R.string.bootcamp4Url),
            Bootcamp(R.string.bootcamp5, R.drawable.kenzie_academy, R.string.bootcamp5Desc, R.string.bootcamp5Url),
            Bootcamp(R.string.bootcamp6, R.drawable.general_assembly, R.string.bootcamp6Desc, R.string.bootcamp6Url),
            Bootcamp(R.string.bootcamp7, R.drawable.codingdojo, R.string.bootcamp7Desc, R.string.bootcamp7Url),
            Bootcamp(R.string.bootcamp8, R.drawable.brain_station, R.string.bootcamp8Desc, R.string.bootcamp8Url),
            Bootcamp(R.string.bootcamp9, R.drawable.freecodecamp, R.string.bootcamp9Desc, R.string.bootcamp9Url),
            Bootcamp(R.string.bootcamp10, R.drawable.columbia_university, R.string.bootcamp10Desc, R.string.bootcamp10Url),
        )
    }
}
