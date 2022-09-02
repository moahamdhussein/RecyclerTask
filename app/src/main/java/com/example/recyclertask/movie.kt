package com.example.recyclertask

import android.os.Parcel
import android.os.Parcelable

data class movie(var name: String?, var description: String?, var image: Int) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(description)
        parcel.writeInt(image)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<movie> {
        override fun createFromParcel(parcel: Parcel): movie {
            return movie(parcel)
        }

        override fun newArray(size: Int): Array<movie?> {
            return arrayOfNulls(size)
        }
    }

}



