/*
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.core.impl.heuristic.selector;

import org.optaplanner.core.impl.heuristic.selector.common.decorator.SelectionProbabilityWeightFactory;

public interface IterableSelector<T> extends Selector, Iterable<T> {

    /**
     * A random JIT {@link Selector} with {@link #isNeverEnding()} true should return a size
     * as if it would be able to return each distinct element only once,
     * because the size can be used in {@link SelectionProbabilityWeightFactory}.
     *
     * @return the approximate number of elements generated by this {@link Selector}, always {@code >= 0}
     * @throws IllegalStateException if {@link #isCountable} returns false,
     *         but not if only {@link #isNeverEnding()} returns true
     */
    long getSize();

}
