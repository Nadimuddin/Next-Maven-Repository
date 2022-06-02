package com.nadimuddin.nmr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.nadimuddin.nmr.payment.Payment
import com.nadimuddin.nmr.product.Product
import com.nadimuddin.nmr.service.Service

class MainActivity : AppCompatActivity() {

    companion object val TAG: String = MainActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(TAG, "onCreate: ${Product().loadProducts()}")
        Log.i(TAG, "onCreate: ${Service().loadServices()}")
        Log.i(TAG, "onCreate: ${Payment().loadPayment()}")
    }
}