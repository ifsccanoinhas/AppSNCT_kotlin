package edu.ifsc.canoinhas.snct.snctifsccanoinhas.IHC
import android.content.Context
import android.os.AsyncTask
import android.widget.ProgressBar

/**
 * Created by estagiario on 20/09/2017.
 */

class MinhaTask(context: Context, private val progressBar: ProgressBar) : AsyncTask<Any, Any, String>() {

    private var total = 0

    override fun doInBackground(vararg params: Any): String? {
        try {

            Thread.sleep(200)

            for (i in 0..9) {
                publishProgress()
                Thread.sleep(200)
            }

        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        return null
    }

    override fun onProgressUpdate(vararg values: Any) {
        total += PROGRESSO
        progressBar.incrementProgressBy(PROGRESSO)


        super.onProgressUpdate(*values)
    }

    override fun onPostExecute(result: String) {
        progressBar.visibility = ProgressBar.INVISIBLE
        super.onPostExecute(result)
    }

    companion object {
        private val PROGRESSO = 10
    }
}