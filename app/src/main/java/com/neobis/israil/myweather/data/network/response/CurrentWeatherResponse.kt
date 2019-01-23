package com.neobis.israil.myweather.data.network.response

import com.google.gson.annotations.SerializedName
import com.neobis.israil.myweather.data.db.entity.CurrentWeatherEntry
import com.neobis.israil.myweather.data.db.entity.Location

data class CurrentWeatherResponse(
    @SerializedName("current")
    val current: CurrentWeatherEntry,
    val location: Location
)