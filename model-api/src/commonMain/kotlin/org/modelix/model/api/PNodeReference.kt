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

import org.modelix.model.area.IArea

data class PNodeReference(val id: Long) : INodeReference {

    override fun resolveNode(area: IArea?): INode? {
        return area?.resolveNode(this)
    }

    override fun toString(): String {
        return "PNodeReference_${id.toString(16)}"
    }
}
