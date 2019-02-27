/*
 * Copyright 2019 Haihan Yin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.jsontemplate.templatetests;

import com.github.jsontemplate.JsonTemplate;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class ParserUtils {

    public static DocumentContext parse(JsonTemplate jsonTemplate) {
        String json = jsonTemplate.prettyString();
        comparePrint(jsonTemplate.getTemplate(), json);
        return JsonPath.parse(json);
    }

    private static void comparePrint(String template, String generatedJson) {
        System.out.println("===== Template =====");
        System.out.println(template);
        System.out.println("===== Generated Json =====");
        System.out.println(generatedJson);
    }
}