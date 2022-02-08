package com.golfscores.repositories

import com.golfscores.dtos.Player
import com.squareup.moshi.JsonAdapter
import okio.buffer
import okio.source
import java.nio.file.Paths

class PlayersRepository(private val playerJsonsAdapter: JsonAdapter<List<Player>>) {

    companion object {
        const val JSON_FILE_PATH = "src/main/resources/json.players/players.json"
    }

    private val players = mutableListOf<Player>()

    private val bufferedSource = Paths.get(JSON_FILE_PATH).source().buffer()

    fun getPlayers(): List<Player> {
        if (players.isEmpty()) {
            playerJsonsAdapter.fromJson(bufferedSource)?.let { players.addAll(it) }
        }
        return players
    }

}
