package com.Phase4.pathways.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


data class Bootcamp(
    @StringRes val titleResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val descriptionResourceId: Int,
    @StringRes val urlResourceId: Int
)
