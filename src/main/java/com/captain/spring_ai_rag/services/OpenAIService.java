package com.captain.spring_ai_rag.services;

import com.captain.spring_ai_rag.model.Answer;
import com.captain.spring_ai_rag.model.Question;

/**
 * Created by Jackson G. Mwaniki
 */
public interface  OpenAIService {

    Answer getAnswer(Question question);
}
