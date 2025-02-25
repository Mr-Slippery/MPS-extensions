/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License. 
 */

package org.modelix.model.api

interface IBranch {
    fun getId(): String?
    fun runRead(runnable: () -> Unit)
    fun <T> computeRead(computable: () -> T): T
    fun runWrite(runnable: () -> Unit)
    fun <T> computeWrite(computable: () -> T): T
    fun canRead(): Boolean
    fun canWrite(): Boolean
    val transaction: ITransaction
    val readTransaction: IReadTransaction
    val writeTransaction: IWriteTransaction
    fun addListener(l: IBranchListener)
    fun removeListener(l: IBranchListener)
}
