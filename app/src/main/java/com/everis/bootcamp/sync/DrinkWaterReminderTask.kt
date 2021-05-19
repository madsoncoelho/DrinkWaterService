package com.everis.bootcamp.sync

import android.content.Context
import com.everis.bootcamp.utils.PreferencesUtils


class DrinkWaterReminderTask {
    //TODO: 001 - Criar uma String constante estatica chamada ACTION_INCREMENT_WATER_COUNT para representar a ação de incrementar o contador
    companion object {
        const val ACTION_INCREMENT_WATER_COUNT = "ACTION_INCREMENT_WATER_COUNT"

        private fun incrementWaterCount(context: Context) {
            PreferencesUtils.incrementWaterCount(context)
        }

        fun executeTask(context: Context, action: String?) {
            if (action == ACTION_INCREMENT_WATER_COUNT) {
                incrementWaterCount(context)
            }
        }
    }

    /*TODO: 002 -
       - Criar uma função privada chamada incrementWaterCount para incrementar o contador de copo de águas
       - Inclua um Context como parametro da função
       - Chame o metodo incrementWaterCount da classe PreferencesUtils
     */

    /*TODO: 003
       - Crie um método publico e estatico para executar a tarefa
       - Coloque um Context como parametro e uma string chamada action
       - Quando a action for igual a constante ACTION_INCREMENT_WATER_COUNT chame o método incrementWaterCount desta classe
     */
}


