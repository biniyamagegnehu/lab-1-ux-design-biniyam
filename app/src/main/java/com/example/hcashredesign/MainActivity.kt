package com.example.hcashredesign

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private enum class Screen {
        LOGIN,
        SIGNUP,
        PERSONAL_INFO,
        PHONE_VERIFICATION,
        SUCCESS,
        ADDITIONAL_VERIFICATION,
        HOME,
        TRANSACTIONS
    }

    private var currentScreen = Screen.LOGIN

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        showLoginScreen()
    }

    private fun showLoginScreen() {
        currentScreen = Screen.LOGIN
        setContentView(R.layout.activity_login)
        applyWindowInsets()

        val btnLogin = findViewById<Button>(R.id.btnLoginSubmit)
        val tvSignUp = findViewById<TextView>(R.id.tvSignUpLink)
        val etPhone = findViewById<EditText>(R.id.etLoginPhone)
        val etPassword = findViewById<EditText>(R.id.etLoginPassword)

        btnLogin.setOnClickListener {
            val phone = etPhone.text.toString().trim()
            val pass = etPassword.text.toString().trim()
            if (phone.isEmpty() || pass.isEmpty()) {
                Toast.makeText(this, "Please enter phone number and password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            showHomeScreen()
        }

        tvSignUp.setOnClickListener {
            showSignupScreen()
        }
    }

    private fun showSignupScreen() {
        currentScreen = Screen.SIGNUP
        setContentView(R.layout.activity_signup)
        applyWindowInsets()

        val btnNext = findViewById<Button>(R.id.btnSignupNext)
        val etRegion = findViewById<EditText>(R.id.etSignupRegion)
        val etName = findViewById<EditText>(R.id.etSignupName)
        val etPhone = findViewById<EditText>(R.id.etSignupPhone)

        btnNext.setOnClickListener {
            val region = etRegion.text.toString().trim()
            val name = etName.text.toString().trim()
            val phone = etPhone.text.toString().trim()
            if (region.isEmpty() || name.isEmpty() || phone.isEmpty()) {
                Toast.makeText(this, "Please fill in all registration fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            showPersonalInfoScreen()
        }
    }

    private fun showPersonalInfoScreen() {
        currentScreen = Screen.PERSONAL_INFO
        setContentView(R.layout.activity_personal_information)
        applyWindowInsets()

        val btnProceed = findViewById<Button>(R.id.btnPersonalInfoProceed)
        val etPin = findViewById<EditText>(R.id.etPersonalInfoPin)
        val etConfirm = findViewById<EditText>(R.id.etPersonalInfoConfirmPin)

        btnProceed.setOnClickListener {
            val pin = etPin.text.toString().trim()
            val confirm = etConfirm.text.toString().trim()
            if (pin.length < 4) {
                Toast.makeText(this, "Please enter at least a 4-digit PIN", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (pin != confirm) {
                Toast.makeText(this, "PINs do not match", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            showPhoneVerificationScreen()
        }
    }

    private fun showPhoneVerificationScreen() {
        currentScreen = Screen.PHONE_VERIFICATION
        setContentView(R.layout.activity_phone_verification)
        applyWindowInsets()

        val btnProceed = findViewById<Button>(R.id.btnVerifyProceed)
        val btnCancel = findViewById<Button>(R.id.btnVerifyCancel)

        btnProceed.setOnClickListener {
            showSuccessScreen()
        }

        btnCancel.setOnClickListener {
            showPersonalInfoScreen()
        }
    }

    private fun showSuccessScreen() {
        currentScreen = Screen.SUCCESS
        setContentView(R.layout.activity_registration_success)
        applyWindowInsets()

        val btnProceed = findViewById<Button>(R.id.btnCongratProceed)

        btnProceed.setOnClickListener {
            showAdditionalVerificationScreen()
        }
    }

    private fun showAdditionalVerificationScreen() {
        currentScreen = Screen.ADDITIONAL_VERIFICATION
        setContentView(R.layout.activity_additional_verification)
        applyWindowInsets()

        val btnProceed = findViewById<Button>(R.id.btnAddVerifyProceed)

        btnProceed.setOnClickListener {
            showHomeScreen()
        }
    }

    private fun showHomeScreen() {
        currentScreen = Screen.HOME
        setContentView(R.layout.activity_home)
        applyWindowInsets()

        val navTransaction = findViewById<LinearLayout>(R.id.navTabTransaction)
        navTransaction.setOnClickListener {
            showTransactionsScreen()
        }
    }

    private fun showTransactionsScreen() {
        currentScreen = Screen.TRANSACTIONS
        setContentView(R.layout.activity_transactions)
        applyWindowInsets()

        val ivBack = findViewById<android.widget.ImageView>(R.id.ivBackTransactions)
        ivBack.setOnClickListener {
            showHomeScreen()
        }
    }

    private fun applyWindowInsets() {
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
