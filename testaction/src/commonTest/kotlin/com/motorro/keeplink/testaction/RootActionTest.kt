/*
 * Copyright 2022 Nikolai Kotchetkov.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.motorro.keeplink.testaction

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class RootActionTest {
    @Test
    fun rootExportsComponents() {
        val root = TestAction.Root()
        assertEquals(listOf(""), root.getPath().toList())
        assertTrue { root.getSearch().isEmpty() }
        assertTrue { root.getHash().isEmpty() }
    }
}