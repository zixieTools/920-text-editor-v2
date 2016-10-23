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
public class LatexLang implements LangDefine {
    private final static String JSON = "{\"tag\":\"MODE\",\"text\":\"\",\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"%\",\"NAME\":\"lineComment\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"\",\"NAME\":\"wordBreakChars\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"\\\\@_-:*<>\",\"NAME\":\"noWordSep\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"FALSE\",\"NAME\":\"deepIndent\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"FALSE\",\"NAME\":\"doubleBracketIndent\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"FALSE\",\"NAME\":\"lineUpClosingBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"(\",\"NAME\":\"unalignedOpenBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\")\",\"NAME\":\"unalignedCloseBrackets\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"HIGHLIGHT_DIGITS\":\"FALSE\",\"IGNORE_CASE\":\"FALSE\",\"NO_WORD_SEP\":\"@_-:*\"},\"child\":[{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"VerbatimRules\",\"HASH_CHAR\":\"\\\\\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\".verb[\\\\*]?([\\\\p{Punct}&&[^*]])\"},{\"tag\":\"END\",\"text\":\"$1\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"VerbatimRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\begin{verbatim*}\"},{\"tag\":\"END\",\"text\":\"\\\\end{verbatim*}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"VerbatimRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\begin{verbatim}\"},{\"tag\":\"END\",\"text\":\"\\\\end{verbatim}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"MathRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"$$\"},{\"tag\":\"END\",\"text\":\"$$\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"MathRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"$\"},{\"tag\":\"END\",\"text\":\"$\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"MathRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\(\"},{\"tag\":\"END\",\"text\":\"\\\\)\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"MathRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\[\"},{\"tag\":\"END\",\"text\":\"\\\\]\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"MathRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\begin{math}\"},{\"tag\":\"END\",\"text\":\"\\\\end{math}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"MathRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\begin{displaymath}\"},{\"tag\":\"END\",\"text\":\"\\\\end{displaymath}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"MathRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\begin{equation*}\"},{\"tag\":\"END\",\"text\":\"\\\\end{equation*}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"MathRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\begin{equation}\"},{\"tag\":\"END\",\"text\":\"\\\\end{equation}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"MathRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\begin{eqnarray*}\"},{\"tag\":\"END\",\"text\":\"\\\\end{eqnarray*}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"MathRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\begin{eqnarray}\"},{\"tag\":\"END\",\"text\":\"\\\\end{eqnarray}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"MathRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\begin{align*}\"},{\"tag\":\"END\",\"text\":\"\\\\end{align*}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"MathRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\begin{align}\"},{\"tag\":\"END\",\"text\":\"\\\\end{align}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"MathRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\begin{alignat*}\"},{\"tag\":\"END\",\"text\":\"\\\\end{alignat*}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"MathRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\begin{alignat}\"},{\"tag\":\"END\",\"text\":\"\\\\end{alignat}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"MathRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\begin{flalign*}\"},{\"tag\":\"END\",\"text\":\"\\\\end{flalign*}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"MathRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\begin{flalign}\"},{\"tag\":\"END\",\"text\":\"\\\\end{flalign}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"MathRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\begin{gather*}\"},{\"tag\":\"END\",\"text\":\"\\\\end{gather*}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"MathRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\begin{gather}\"},{\"tag\":\"END\",\"text\":\"\\\\end{gather}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"MathRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\begin{multline*}\"},{\"tag\":\"END\",\"text\":\"\\\\end{multline*}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"MathRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\begin{multline}\"},{\"tag\":\"END\",\"text\":\"\\\\end{multline}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"KEYWORD4\",\"DELEGATE\":\"LabelRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\label{\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"KEYWORD4\",\"DELEGATE\":\"LabelRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\cite{\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"KEYWORD4\",\"DELEGATE\":\"LabelRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\hyperlink{\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"KEYWORD4\",\"DELEGATE\":\"LabelRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\hypertarget{\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"KEYWORD4\",\"DELEGATE\":\"LabelRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\url{\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"KEYWORD4\",\"DELEGATE\":\"LabelRules\",\"HASH_CHAR\":\"\\\\\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\".[\\\\p{Alnum}]*ref[\\\\*]?\\\\{\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"SEQ\",\"text\":\"\\\\&\",\"attrs\":{\"TYPE\":\"NULL\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\$\",\"attrs\":{\"TYPE\":\"NULL\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\%\",\"attrs\":{\"TYPE\":\"NULL\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\#\",\"attrs\":{\"TYPE\":\"NULL\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\_\",\"attrs\":{\"TYPE\":\"NULL\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\{\",\"attrs\":{\"TYPE\":\"NULL\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\}\",\"attrs\":{\"TYPE\":\"NULL\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\=\",\"attrs\":{\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\>\",\"attrs\":{\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\<\",\"attrs\":{\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\+\",\"attrs\":{\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\-\",\"attrs\":{\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\'\",\"attrs\":{\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\`\",\"attrs\":{\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\^\",\"attrs\":{\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\\\\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\~\",\"attrs\":{\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\.\",\"attrs\":{\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\a'\",\"attrs\":{\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\a`\",\"attrs\":{\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\a=\",\"attrs\":{\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"#[1-9]\",\"attrs\":{\"TYPE\":\"DIGIT\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\\\\\\",\"attrs\":{\"TYPE\":\"KEYWORD3\"}},{\"tag\":\"SEQ\",\"text\":\"&\",\"attrs\":{\"TYPE\":\"KEYWORD3\"}},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT2\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\iffalse\"},{\"tag\":\"END\",\"text\":\"\\\\fi\"}]},{\"tag\":\"EOL_SPAN\",\"text\":\"%\",\"attrs\":{\"TYPE\":\"COMMENT1\"}},{\"tag\":\"SPAN_REGEXP\",\"attrs\":{\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"``\"},{\"tag\":\"END\",\"text\":\"''|\\\"\",\"attrs\":{\"REGEXP\":\"TRUE\"}}]},{\"tag\":\"SPAN\",\"attrs\":{\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"`\"},{\"tag\":\"END\",\"text\":\"\\\"'\"}]},{\"tag\":\"SPAN\",\"attrs\":{\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"<\"},{\"tag\":\"END\",\"text\":\"\\\">\"}]},{\"tag\":\"SPAN\",\"attrs\":{\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\glqq\"},{\"tag\":\"END\",\"text\":\"\\\\grqq\"}]},{\"tag\":\"SPAN\",\"attrs\":{\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\glq\"},{\"tag\":\"END\",\"text\":\"\\\\grq\"}]},{\"tag\":\"SPAN\",\"attrs\":{\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\flqq\"},{\"tag\":\"END\",\"text\":\"\\\\frqq\"}]},{\"tag\":\"SPAN\",\"attrs\":{\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\flq\"},{\"tag\":\"END\",\"text\":\"\\\\frq\"}]},{\"tag\":\"SEQ_REGEXP\",\"text\":\"(.begin\\\\{([\\\\p{Alnum}|@|\\\\*]*)\\\\})\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"HASH_CHAR\":\"\\\\\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"(.end\\\\{([\\\\p{Alnum}|@|\\\\*]*)\\\\})\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"HASH_CHAR\":\"\\\\\"}},{\"tag\":\"MARK_FOLLOWING\",\"text\":\"\\\\\",\"attrs\":{\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"SEQ\",\"text\":\"{\",\"attrs\":{\"TYPE\":\"KEYWORD4\"}},{\"tag\":\"SEQ\",\"text\":\"}\",\"attrs\":{\"TYPE\":\"KEYWORD4\"}},{\"tag\":\"SEQ\",\"text\":\"[\",\"attrs\":{\"TYPE\":\"KEYWORD4\"}},{\"tag\":\"SEQ\",\"text\":\"]\",\"attrs\":{\"TYPE\":\"KEYWORD4\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"MathRules\",\"HIGHLIGHT_DIGITS\":\"FALSE\",\"DEFAULT\":\"LITERAL2\",\"IGNORE_CASE\":\"FALSE\",\"NO_WORD_SEP\":\"@:\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"KEYWORD4\",\"DELEGATE\":\"LabelRules\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\label{\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"SEQ\",\"text\":\"\\\\&\",\"attrs\":{\"TYPE\":\"LITERAL2\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\$\",\"attrs\":{\"TYPE\":\"LITERAL2\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\%\",\"attrs\":{\"TYPE\":\"LITERAL2\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"#[1-9]\",\"attrs\":{\"TYPE\":\"DIGIT\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\\\\\\",\"attrs\":{\"TYPE\":\"KEYWORD3\"}},{\"tag\":\"SEQ\",\"text\":\"&\",\"attrs\":{\"TYPE\":\"KEYWORD3\"}},{\"tag\":\"MARK_FOLLOWING\",\"text\":\"\\\\label{\",\"attrs\":{\"TYPE\":\"LABEL\",\"MATCH_TYPE\":\"KEYWORD4\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"%\",\"attrs\":{\"TYPE\":\"COMMENT1\"}}]},{\"tag\":\"RULES\",\"attrs\":{\"SET\":\"VerbatimRules\",\"DEFAULT\":\"LITERAL3\"}},{\"tag\":\"RULES\",\"attrs\":{\"SET\":\"LabelRules\",\"DEFAULT\":\"LABEL\"}}]}";

    @Override
    public String langDefine() {
        return JSON;
    }
}