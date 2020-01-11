package mohan.com.dikoin.data.repository

import mohan.com.dikoin.domain.GithubApi

class UserRepository(private val api: GithubApi) {
    fun getAllUsers() = api.getUsers()
    //fun getGitUsers()=api.
}