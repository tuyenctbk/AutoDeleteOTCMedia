package joyfunee.autodeleteotcmedia.activity

import android.Manifest
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import joyfunee.autodeleteotcmedia.R

open class BaseActivity : AppCompatActivity() {


    val neededPermissions = arrayOf(
        Manifest.permission.READ_EXTERNAL_STORAGE,
        Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.INTERNET
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (needRequestPermissions())
            requestNeededPermissions()
        else
            initAll()
    }

    private fun initAll() {
        loadPreferences()
        initUI()
    }

    private fun initUI() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun loadPreferences() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun requestNeededPermissions() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun needRequestPermissions(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private val REQUEST_PERMISSION_CODE: Int = 101

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == REQUEST_PERMISSION_CODE) {
            if (needRequestPermissions()) {
                Toast.makeText(this, R.string.permission_denied_close_app, Toast.LENGTH_SHORT).show()
                finish()
            }
        }
    }
}