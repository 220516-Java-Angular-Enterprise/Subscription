package com.revature.subscription.services;

import java.util.List;

public class SubService {

    public class SubService {
        private final SubDAO subDAO;

        public SubService(SubDAO subDAO) {
            this.subDAO = subDAO;
        }

        public void register(Sub sub) {
            subDAO.save(sub);
        }

        public List<Sub> getAllSub() {
            return subDAO.getAll();
        }


    }

