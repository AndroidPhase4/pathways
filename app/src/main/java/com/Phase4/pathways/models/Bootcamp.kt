package com.Phase4.pathways.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Bootcamp(
    @StringRes val stringResourceId: Int,
    @StringRes val stringResourceId2: Int,
    @DrawableRes val imageResourceId: Int
)
