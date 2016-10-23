/*
 * Copyright (C) 2016 Jecelyin Peng <jecelyin@gmail.com>
 *
 * This file is part of 920 Text Editor.
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

package com.jecelyin.editor.v2.highlight.lang;

import com.jecelyin.editor.v2.highlight.LangDefine;

/**
 * @author Jecelyin Peng <jecelyin@gmail.com>
 */
public class AspectJLang implements LangDefine {
    private final static String JSON = "{\"tag\":\"MODE\",\"text\":\"\",\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"{\",\"NAME\":\"indentOpenBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"}\",\"NAME\":\"indentCloseBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"\\\\s*(((if|while)\\\\s*\\\\(|else\\\\s*|else\\\\s+if\\\\s*\\\\(|for\\\\s*\\\\(.*\\\\))[^{;]*)\",\"NAME\":\"indentPrevLine\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"false\",\"NAME\":\"doubleBracketIndent\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"/*\",\"NAME\":\"commentStart\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"*/\",\"NAME\":\"commentEnd\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"//\",\"NAME\":\"lineComment\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\",+-=<>/?^&*\",\"NAME\":\"wordBreakChars\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"HIGHLIGHT_DIGITS\":\"TRUE\",\"DIGIT_RE\":\"(0x)?[\\\\p{XDigit}]+[lLdDfF]?\",\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"SEQ\",\"text\":\"/**/\",\"attrs\":{\"TYPE\":\"COMMENT1\"}},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT3\",\"DELEGATE\":\"java::JAVADOC\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"/**\"},{\"tag\":\"END\",\"text\":\"*/\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"/*\"},{\"tag\":\"END\",\"text\":\"*/\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL1\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL1\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"EOL_SPAN\",\"text\":\"//\",\"attrs\":{\"TYPE\":\"COMMENT2\"}},{\"tag\":\"SEQ\",\"text\":\"=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"!\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"+\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"-\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"/\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\".*\",\"attrs\":{\"TYPE\":\"NULL\"}},{\"tag\":\"SEQ\",\"text\":\"*\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"%\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"&\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"|\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"^\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"~\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"}\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"{\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"MARK_PREVIOUS\",\"text\":\":\",\"attrs\":{\"AT_WHITESPACE_END\":\"TRUE\",\"TYPE\":\"LABEL\",\"MATCH_TYPE\":\"OPERATOR\"}},{\"tag\":\"MARK_PREVIOUS\",\"text\":\"(\",\"attrs\":{\"TYPE\":\"FUNCTION\",\"MATCH_TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\")\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD1\",\"text\":\"abstract\"},{\"tag\":\"KEYWORD1\",\"text\":\"break\"},{\"tag\":\"KEYWORD1\",\"text\":\"case\"},{\"tag\":\"KEYWORD1\",\"text\":\"catch\"},{\"tag\":\"KEYWORD1\",\"text\":\"continue\"},{\"tag\":\"KEYWORD1\",\"text\":\"default\"},{\"tag\":\"KEYWORD1\",\"text\":\"do\"},{\"tag\":\"KEYWORD1\",\"text\":\"else\"},{\"tag\":\"KEYWORD1\",\"text\":\"extends\"},{\"tag\":\"KEYWORD1\",\"text\":\"final\"},{\"tag\":\"KEYWORD1\",\"text\":\"finally\"},{\"tag\":\"KEYWORD1\",\"text\":\"for\"},{\"tag\":\"KEYWORD1\",\"text\":\"if\"},{\"tag\":\"KEYWORD1\",\"text\":\"implements\"},{\"tag\":\"KEYWORD1\",\"text\":\"instanceof\"},{\"tag\":\"KEYWORD1\",\"text\":\"native\"},{\"tag\":\"KEYWORD1\",\"text\":\"new\"},{\"tag\":\"KEYWORD1\",\"text\":\"private\"},{\"tag\":\"KEYWORD1\",\"text\":\"protected\"},{\"tag\":\"KEYWORD1\",\"text\":\"public\"},{\"tag\":\"KEYWORD1\",\"text\":\"return\"},{\"tag\":\"KEYWORD1\",\"text\":\"static\"},{\"tag\":\"KEYWORD1\",\"text\":\"switch\"},{\"tag\":\"KEYWORD1\",\"text\":\"synchronized\"},{\"tag\":\"KEYWORD1\",\"text\":\"throw\"},{\"tag\":\"KEYWORD1\",\"text\":\"throws\"},{\"tag\":\"KEYWORD1\",\"text\":\"transient\"},{\"tag\":\"KEYWORD1\",\"text\":\"try\"},{\"tag\":\"KEYWORD1\",\"text\":\"volatile\"},{\"tag\":\"KEYWORD1\",\"text\":\"while\"},{\"tag\":\"KEYWORD2\",\"text\":\"package\"},{\"tag\":\"KEYWORD2\",\"text\":\"import\"},{\"tag\":\"KEYWORD3\",\"text\":\"boolean\"},{\"tag\":\"KEYWORD3\",\"text\":\"byte\"},{\"tag\":\"KEYWORD3\",\"text\":\"char\"},{\"tag\":\"KEYWORD3\",\"text\":\"class\"},{\"tag\":\"KEYWORD3\",\"text\":\"double\"},{\"tag\":\"KEYWORD3\",\"text\":\"float\"},{\"tag\":\"KEYWORD3\",\"text\":\"int\"},{\"tag\":\"KEYWORD3\",\"text\":\"interface\"},{\"tag\":\"KEYWORD3\",\"text\":\"long\"},{\"tag\":\"KEYWORD3\",\"text\":\"short\"},{\"tag\":\"KEYWORD3\",\"text\":\"void\"},{\"tag\":\"FUNCTION\",\"text\":\"assert\"},{\"tag\":\"KEYWORD1\",\"text\":\"strictfp\"},{\"tag\":\"LITERAL2\",\"text\":\"false\"},{\"tag\":\"LITERAL2\",\"text\":\"null\"},{\"tag\":\"LITERAL2\",\"text\":\"super\"},{\"tag\":\"LITERAL2\",\"text\":\"this\"},{\"tag\":\"LITERAL2\",\"text\":\"true\"},{\"tag\":\"INVALID\",\"text\":\"goto\"},{\"tag\":\"INVALID\",\"text\":\"const\"},{\"tag\":\"KEYWORD4\",\"text\":\"args\"},{\"tag\":\"KEYWORD4\",\"text\":\"percflow\"},{\"tag\":\"KEYWORD4\",\"text\":\"get\"},{\"tag\":\"KEYWORD4\",\"text\":\"set\"},{\"tag\":\"KEYWORD4\",\"text\":\"preinitialization\"},{\"tag\":\"KEYWORD4\",\"text\":\"handler\"},{\"tag\":\"KEYWORD4\",\"text\":\"adviceexecution\"},{\"tag\":\"KEYWORD4\",\"text\":\"cflow\"},{\"tag\":\"KEYWORD4\",\"text\":\"target\"},{\"tag\":\"KEYWORD4\",\"text\":\"cflowbelow\"},{\"tag\":\"KEYWORD4\",\"text\":\"withincode\"},{\"tag\":\"KEYWORD4\",\"text\":\"declare\"},{\"tag\":\"KEYWORD4\",\"text\":\"precedence\"},{\"tag\":\"KEYWORD4\",\"text\":\"issingleton\"},{\"tag\":\"KEYWORD4\",\"text\":\"perthis\"},{\"tag\":\"KEYWORD4\",\"text\":\"pertarget\"},{\"tag\":\"KEYWORD4\",\"text\":\"privileged\"},{\"tag\":\"KEYWORD4\",\"text\":\"after\"},{\"tag\":\"KEYWORD4\",\"text\":\"around\"},{\"tag\":\"KEYWORD4\",\"text\":\"aspect\"},{\"tag\":\"KEYWORD4\",\"text\":\"before\"},{\"tag\":\"KEYWORD4\",\"text\":\"call\"},{\"tag\":\"KEYWORD4\",\"text\":\"execution\"},{\"tag\":\"KEYWORD4\",\"text\":\"initialization\"},{\"tag\":\"KEYWORD4\",\"text\":\"pointcut\"},{\"tag\":\"KEYWORD4\",\"text\":\"proceed\"},{\"tag\":\"KEYWORD4\",\"text\":\"staticinitialization\"},{\"tag\":\"KEYWORD4\",\"text\":\"within\"},{\"tag\":\"KEYWORD4\",\"text\":\"..\"}]}]}]}";

    @Override
    public String langDefine() {
        return JSON;
    }
}