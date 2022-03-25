package com.Phase4.pathways.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Job(
    @StringRes val jobTitleId: Int,
    @DrawableRes val jobImageResourceId: Int,
    @StringRes val jobDescriptionId: Int,
    @StringRes val jobUrlResourceId: Int
)