/*
 * Copyright ${year} the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openrewrite.gradle;

import org.gradle.api.Project;
import org.openrewrite.config.RecipeDescriptor;

import java.lang.reflect.InvocationTargetException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.concurrent.Callable;

public interface GradleProjectParser {
    SortedSet<String> getActiveRecipes();

    SortedSet<String> getActiveStyles();

    SortedSet<String> getAvailableStyles();

    Collection<RecipeDescriptor> listRecipeDescriptors();

    Collection<Path> listSources(Project project);

    void run(boolean useAstCache);

    void dryRun(Path reportPath, boolean useAstCache);

    void clearAstCache();

    void shutdownRewrite();
}