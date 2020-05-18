package Models

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR
import java.util.*

class BindableString : BaseObservable() {
    private var value : String ? = null
    @Bindable
    fun getValue(): String {
        //obtener data de los campos de texto
        return if (value != null ) value!! else ""
    }
    fun setValue(value : String){
        if(!Objects.equals(this.value,value)){
            this.value = value
            notifyPropertyChanged(BR.value)
        }
    }

}