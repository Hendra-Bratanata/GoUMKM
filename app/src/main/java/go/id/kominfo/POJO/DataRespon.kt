package go.id.kominfo.POJO

import com.google.gson.annotations.SerializedName

data class DataRespon(

        @SerializedName("kode")
        var kode:String? = null,

        @SerializedName("pesan")
        var pesan:String?=null

)