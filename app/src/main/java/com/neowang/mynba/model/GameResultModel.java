package com.neowang.mynba.model;

import java.util.List;

/**
 * Created by cd14 on 2016/10/11.
 */

public class GameResultModel {


    private String title;
    /**
     * st0 : 未开赛
     * st1 : 直播中
     * st2 : 已结束
     */

    private StatuslistBean statuslist;

    private List<ListBean> list;
    /**
     * name : 老鹰
     * url : http://nba.sports.sina.com.cn/team_match.php?id=1
     */

    private List<TeammatchBean> teammatch;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public StatuslistBean getStatuslist() {
        return statuslist;
    }

    public void setStatuslist(StatuslistBean statuslist) {
        this.statuslist = statuslist;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public List<TeammatchBean> getTeammatch() {
        return teammatch;
    }

    public void setTeammatch(List<TeammatchBean> teammatch) {
        this.teammatch = teammatch;
    }

    public static class StatuslistBean {
        private String st0;
        private String st1;
        private String st2;

        public String getSt0() {
            return st0;
        }

        public void setSt0(String st0) {
            this.st0 = st0;
        }

        public String getSt1() {
            return st1;
        }

        public void setSt1(String st1) {
            this.st1 = st1;
        }

        public String getSt2() {
            return st2;
        }

        public void setSt2(String st2) {
            this.st2 = st2;
        }
    }

    public static class ListBean {
        private String title;
        /**
         * link1text : 视频集锦
         * link1url : http://video.sina.com.cn/p/sports/k/v/2014-12-07/140064340433.html
         * link2text : 技术统计
         * link2url : http://nba.sports.sina.com.cn/look_scores.php?id=2014120608
         * player1 : 76人
         * player1logo : http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/20.png
         * player1logobig : http://p4.qhimg.com/t01d3db357326a5f9b7.png
         * player1url : http://nba.sports.sina.com.cn/team.php?id=20
         * player2 : 活塞
         * player2logo : http://www.sinaimg.cn/ty/deco/2013/1108/nbalogo/8.png
         * player2logobig : http://p4.qhimg.com/t014bc2a39f1ff5a13a.png
         * player2url : http://nba.sports.sina.com.cn/team.php?id=8
         * score : 108-101
         * status : 2
         * time : 12/07 08:30
         */

        private List<TrBean> tr;
        /**
         * text : 常规赛赛程
         * url : http://nba.sports.sina.com.cn/match_result.php
         */

        private List<BottomlinkBean> bottomlink;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<TrBean> getTr() {
            return tr;
        }

        public void setTr(List<TrBean> tr) {
            this.tr = tr;
        }

        public List<BottomlinkBean> getBottomlink() {
            return bottomlink;
        }

        public void setBottomlink(List<BottomlinkBean> bottomlink) {
            this.bottomlink = bottomlink;
        }

        public static class TrBean {
            private String link1text;
            private String link1url;
            private String link2text;
            private String link2url;
            private String player1;
            private String player1logo;
            private String player1logobig;
            private String player1url;
            private String player2;
            private String player2logo;
            private String player2logobig;
            private String player2url;
            private String score;
            private int status;
            private String time;

            public String getLink1text() {
                return link1text;
            }

            public void setLink1text(String link1text) {
                this.link1text = link1text;
            }

            public String getLink1url() {
                return link1url;
            }

            public void setLink1url(String link1url) {
                this.link1url = link1url;
            }

            public String getLink2text() {
                return link2text;
            }

            public void setLink2text(String link2text) {
                this.link2text = link2text;
            }

            public String getLink2url() {
                return link2url;
            }

            public void setLink2url(String link2url) {
                this.link2url = link2url;
            }

            public String getPlayer1() {
                return player1;
            }

            public void setPlayer1(String player1) {
                this.player1 = player1;
            }

            public String getPlayer1logo() {
                return player1logo;
            }

            public void setPlayer1logo(String player1logo) {
                this.player1logo = player1logo;
            }

            public String getPlayer1logobig() {
                return player1logobig;
            }

            public void setPlayer1logobig(String player1logobig) {
                this.player1logobig = player1logobig;
            }

            public String getPlayer1url() {
                return player1url;
            }

            public void setPlayer1url(String player1url) {
                this.player1url = player1url;
            }

            public String getPlayer2() {
                return player2;
            }

            public void setPlayer2(String player2) {
                this.player2 = player2;
            }

            public String getPlayer2logo() {
                return player2logo;
            }

            public void setPlayer2logo(String player2logo) {
                this.player2logo = player2logo;
            }

            public String getPlayer2logobig() {
                return player2logobig;
            }

            public void setPlayer2logobig(String player2logobig) {
                this.player2logobig = player2logobig;
            }

            public String getPlayer2url() {
                return player2url;
            }

            public void setPlayer2url(String player2url) {
                this.player2url = player2url;
            }

            public String getScore() {
                return score;
            }

            public void setScore(String score) {
                this.score = score;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class BottomlinkBean {
            private String text;
            private String url;

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }

    public static class TeammatchBean {
        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
