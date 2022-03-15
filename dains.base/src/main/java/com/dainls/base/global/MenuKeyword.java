package com.dainls.base.global;

public class MenuKeyword {

	/***
	 * @공통 : BASE
	 * @관리자 : ADMIN
	 * @사용자 : CLIENT
	 */

	public static final String A = "a";
	public static final String R = "r";
	public static final String W = "w";
	public static final String Z = "z";

	public static final String M = "m";
	public static final String N = "n";
	public static final String T = "t";



	/***
	 * @최고관리자 : ADMIN
	 * @관리자 : MNG
	 */

	/*
	 * 관리자화면
	 */
	public static final String ADMIN_ADMIN_MAIN = "adminMain"; // 메인 화면

	/*
	 * 관리자화면 포탈관리
	 */
	public static final String ADMIN_MENU_MNG = "menuMng"; // 메뉴 관리
	public static final String ADMIN_CONTENTS_MNG = "contentsMng"; // 콘텐츠 관리

	/*
	 * 관리자화면 시스템관리
	 */
	public static final String ADMIN_USER_MNG = "userMng"; // 사용자 관리
	public static final String ADMIN_USER_REG_MNG_STF = "userRegMngSTF"; // *사용자 등록 관리
	public static final String ADMIN_ROLE_MNG = "role_Mng"; // 권한 관리
	public static final String STAFF_WITHDRAWAL_STF = "withdrwalSTF"; // *관리자 회원 탈퇴
	public static final String ADMIN_LOGIN_HISTORY = "loginHistory"; // 로그인 기록
	public static final String ADMIN_DATATABLE_SAMPLE = "dataTableSample"; // ??
	public static final String ADMIN_MENU_LOG_MNG = "menuLogMng"; // 메뉴 사용기록
	public static final String ADMIN_ROLE_LOG_MNG = "roleLogMng"; // 권한부여 이력 조회
	public static final String ADMIN_SQL_LOG_MNG = "sqlLogMng"; // SQL 로그 조회

	/***
	 * @고객 : CLIENT
	 * @교수 : STAFF
	 */

	/*
	 * 관리자화면 교육연구단(팀) 소개 관리
	 */
	public static final String STAFF_BK21TEAM_INTRO_STF = "bk21TeamIntroSTF"; // BK21 교육연구단 소개
	public static final String STAFF_BK21TEAM_BOARD_STF = "bk21TeamBoardSTF"; // BK21 교육연구단 게시판
	public static final String STAFF_BK21_PRTCP_INFO = "bk21PrtcpInfo"; // BK21 사업단 참여 정보

	/*
	 * 관리자화면 학업활동(G-MAP) 관리
	 */
	public static final String STAFF_CURR_SYS_MNG_STF = "currSysMngSTF"; // 교과목 이수 체계도 관리
	public static final String STAFF_PASS_CURRI_LIST_STF = "passCurriListSTF"; // 교과 이수현황 조회

	/*
	 * 관리자화면 BK21 교육 프로그램 관리
	 */
	public static final String STAFF_NCR_PROGRAM_CAL_STF = "ncrProgramCalSTF"; // 프로그램 운영 일정
	public static final String STAFF_NCR_PROGRAM_REG_STF = "ncrProgramRegSTF"; // 프로그램 등록
	public static final String STAFF_NCR_PROGARM_LIST_STF = "ncrProgramListSTF"; // 프로그램 운영 현황
	public static final String STAFF_NCR_HYLU_PROGARM_LIST_STF = "ncrHyluProgramListSTF"; // HYLU 프로그램 운영현황
	public static final String STAFF_NCR_PROGARM_REPO_STF = "ncrProgramRepoSTF"; // 프로그램 결과 보고서
	public static final String STAFF_NCR_PROGARM_CQI_STF = "ncrProgramCqiSTF"; // 프로그램 CQI

	/*
	 * 관리자화면 마이크로 전공 관리
	 */
	public static final String STAFF_MICRO_MJR_MNG_STF = "microMjrMngSTF"; // 마이크로 전공 관리
	public static final String STAFF_MICRO_MJR_INTRO_MNG_STF = "microMjrIntroMngSTF"; // 소개 문구 관리

	/*
	 * 관리자화면 커뮤니티 관리
	 */
	// noticeSTF 공지사항
	// qnaSTF QnA
	// faqSTF FAQ
	// resourceSTF 자료실

	/*
	 * 관리자화면 통계 현황
	 */
	public static final String STAFF_NCR_PROGRAM_STATS_STF = "ncrProgramStatSTF"; // 통계프로그램

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/*
	 * 학생 화면
	 */
	public static final String CLIENT_CLIENT_MAIN = "clientMain"; // 메인 화면

	/*
	 * 학생화면 ERICA BK21 소개
	 */
	public static final String CLIENT_BK21_GREETING = "bk21Greeting"; // BK21 인사말 (소개)
	public static final String CLIENT_BK21_BIZ_OVERVIEW = "bk21BizOverview"; // BK21 사업 개요
	public static final String CLIENT_BK21_VISION = "bk21Vision"; // Bk21 비전
	public static final String CLIENT_BK21_ORGANIZATION = "bk21Organization"; // BK21 조직도
	public static final String CLIENT_BK21_Directions = "bk21Directions"; // BK21 찾아오시는 길

	// bk21Intro2 9 1 6 10 9 8 3 10
	public static final String CLIENT_BK21_TEAM_BOARD = "bk21TeamBoard"; // BK21 교육연구단 공지사항

	public static final String CLIENT_BK21_PORT_FOLIO_INTRO = "bk21PortFolioIntro"; // BK21 소개 e-포트폴리오
	public static final String CLIENT_MENU_PATH = "menuPath"; // {menuPath} // ???

	/*
	 * 학생화면 학업활동(G-MAP)
	 */
	public static final String CLIENT_CURR_SYS_MNG = "currSysMng"; // 교과목 이수 쳬계도
	public static final String CLIENT_PASS_CURRI_LIST = "passCurriList"; // 나의 교과목 이수현황

	/*
	 * 학생화면 ERICA BK21 프로그램
	 */
	public static final String CLIENT_NCR_PROGRAM_APPL = "ncrProgramAppl"; // 프로그램 신청 : NCR(비교과) 프로그램 지원
	public static final String CLIENT_MY_NCR_PROGRAM = "myNcrProgram"; // 프로그램 신청 내역

	/*
	 * 학생화면 마이크로 전공 신청
	 */
	public static final String CLIENT_MICRO_MJ_APPL = "microMjAppl"; // 마이크로 전공 신청

	/*
	 * 학생화면 상담센터
	 */
	public static final String CLIENT_DREAM_CNS = "dreamCns"; // 행복드림 상담센터
	public static final String CLIENT_JOB_CNS = "jobCns"; // 커리어 개발센터

	/*
	 * 학생화면 e-포트폴리오
	 */
	public static final String CLIENT_PORTFOLIO = "portfolio"; // 나의 e-포트폴리오 : 기본 정보 조회

	/*
	 * 학생화면 커뮤니티
	 */
	// notice 공지사항
	// qna QnA
	public static final String CLIENT_FAQ = "faq"; // FAQ
	// resource 자료실

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static final String STAFF_CAMPUS_CAREERS_REG_STF = "campusCareersRegSTF"; // 교내 채용정보 등록
	public static final String STAFF_CAMPUS_CAREERS_MNG_STF = "campusCareersMngSTF"; // 교내 추천채용 관리
	public static final String STAFF_MAJOR_GUIDE_REG_STF = "majorGuideRegSTF"; // 전공진로 가이드 등록
	public static final String STAFF_MAJOR_GUIDE_MNG_STF = "majorGuideMngSTF"; // 진공진로 가이드 관리
	public static final String STAFF_GRADUATE_MNG_STF = "graduateMngSTF"; // 졸업자 관리
	public static final String STAFF_CAREER_DESIGN_STF = "careerDesignSTF"; // 진로 설계
	public static final String STAFF_CERTIFICATE_HIST_ADMIN = "certificateHistAdmin"; // U-PAM 내역 이력페이지(?)
	public static final String STAFF_CERTI_ISSUE_STF = "certiIssueSTF"; // 증명서 발급 현황
	public static final String STAFF_CERTI_STATE = "certiState"; // 인증 현황
	public static final String STAFF_CNS_EMP_STF = "cnsEmpSTF"; // 진로취업 상담 관리
	public static final String STAFF_CNS_EMP_ON_STF = "cnsEmpOnSTF"; // 온라인 상담 현황
	public static final String STAFF_CNS_EMP_CNSLR_STF = "cnsEmpCnslrSTF"; // 상담사 관리
	public static final String STAFF_CNS_PROF_STF = "cnsProfSTF"; // 교수 상담
	public static final String STAFF_CNS_SATIS_STF = "cnsSatisSTF"; // 상담 만족도 조사
	public static final String STAFF_BOARD_TYPE = "boardType"; // {boardType}
	public static final String STAFF_DIAG_ADD_STF = "diagAddSTF"; // 핵심역량진단 등록
	public static final String STAFF_DIAG_MNG_STF = "diagMngSTF"; // 진단 수정
	public static final String STAFF_DIAG_QUS_ADD_STF = "diagQusAddSTF"; // 핵심역량진단 문항 등록
	public static final String STAFF_DIAG_QUS_MNG_STF = "diagQusMngSTF"; // 핵심역량진단 문항 관리
	public static final String STAFF_PROF_CPCT_DIAG_STF = "profCpctDiagSTF"; // 교수역량진단
	public static final String STAFF_CAT_DIAG_STF = "catDiagSTF"; // CAT 진단 현황 메뉴
	public static final String STAFF_MLST_DIAG_STF = "mlstDiagSTF"; // MLST 진단 메뉴
	public static final String STAFF_DIAG_RSLT_STF = "diagRsltSTF"; // MLST 진단 해당 데이터가져오기
	public static final String STAFF_SNULEARN_RSLT_STF = "snulearnRsltSTF"; // SNU 학습유형 진단 검사 결과

	public static final String STAFF_MILEAGE_STATUS = "mileageStatus"; // 마일리지 현황
	public static final String STAFF_ALMN_EMP_STA = "almnEmpSta"; // 동문구인구직
	public static final String STAFF_PEER_REVW_LIST_STF = "peerRevwListSTF"; // 동료평가 기본정보
	public static final String STAFF_SBJT_PROGRAM_LIST_STF = "sbjtProgramListSTF"; // 교과정보 조회
	public static final String STAFF_SHARE_PORTFOLIO_STF = "sharePortfolioSTF"; // 역량개발 관리
	public static final String STAFF_NCR_SMT_LEARN_MNG_STF = "ncrSmtLearnMngSTF"; // 스마트러닝 관리
	public static final String STAFF_LOGIN_STAT_STF = "loginStatSTF"; // 로그인 접속 통계
	public static final String STAFF_SURVEY_MNG_STF = "surveyMngSTF"; // 설문조사 목록
	public static final String STAFF_ADULT_JOB_EXAM_STF = "adultJobExamSTF"; // 성인용 직업적성검사
	public static final String STAFF_JOB_PREF_EXAM_STF = "jobPrefExamSTF"; // 직업 선호도 검사
	public static final String STAFF_FOUND_APT_EXAM_STF = "foundAptExamSTF"; // 창업 적성 검사
	public static final String STAFF_JOB_VALUES_EXAM_STF = "jobValuesExamSTF"; // 직업 가치관 검사

	public static final String CLIENT_ACTIVITY = "activity"; // 역량 개발 활동

	public static final String CLIENT_CAMPUS_CAREER_MNG = "campusCareersMng"; // 진로 관리
	public static final String CLIENT_CAREER_DESIGN = "careerDesign"; // 진로 설계
	public static final String CLIENT_CAREER_QUEST = "careerQuest"; // 진로 탐색
	public static final String CLIENT_MY_ROADMAP = "myRoadmap"; // 나의 로드맵
	public static final String CLIENT_ABLITY_POINT_HIS = "ablityPointHis";
	public static final String CLIENT_MILEAGE_HIS = "mileageHis"; // 마일리지 히스토리
	public static final String CLIENT_CERTI_STATE_CLIENT = "certiStateClient"; // 자격증 상태 ?

	public static final String CLIENT_CNS_EMP = "cnsEmp"; // 진로, 취업 상담
	public static final String CLIENT_CNS_HIS = "cnsHis"; // 상담 이력
	public static final String CLIENT_CNS_PROF = "cnsProf"; // 교수 상담
	public static final String CLIENT_BOARD_DIV = "boardDiv"; // {boardDiv} // 게시판

	public static final String CLIENT_DIAG = "diag"; // 진단
	public static final String CLIENT_SNU_DIAG = "snuDiag"; // SNU 진단
	public static final String CLIENT_SNU_DIAG_RSLT = "snuDiagRslt"; // SNU 진단 결과
	public static final String CLIENT_MAJOR_DIAG = "majorDiag"; // 전공 역량 진단
	public static final String CLIENT_MAJOR_DIAG_RSLT = "majorDiagRslt"; // 전공 역량 진단 결과
	public static final String CLIENT_DIAG_RSLT = "diagRslt"; // 핵심 역량 진단 결과
	public static final String CLIENT_DIAG_TYPE = "diagType"; // {diagType}
	public static final String CLIENT_EMPLOY_INFO_NCS = "employInfoNCS"; // NCS 정보
	public static final String CLIENT_EMPLOY_INFO_LICENSE = "employInfoLicense"; // 자격증 정보
	public static final String CLIENT_EMPLOY_INFO_VIDEO = "employInfoVideo"; // 직업 방송 동영상
	public static final String CLIENT_EMPLOY_INFO_COMPANY = "employInfoCompany"; // 기업 정보
	public static final String CLIENT_MAJOR_CAREER_GUIDE = "majorCareerGuide"; // 진로 전공 가이드
	public static final String CLIENT_CAT_DIAG = "catDiag"; // CAT 진단
	public static final String CLIENT_MLST_DIAG = "mlstDiag"; // MLST 진단

	public static final String CLIENT_TALENT = "clientTalent"; // 인재상
	public static final String CLIENT_DIAG_INTRO = "clientDiagIntro"; // 핵심 역량 소개
	public static final String CLIENT_MY_LEARN = "clientMyLearn"; // mylearn 소개

	public static final String CLIENT_PROGRAM_GUBUN = "programGubun"; // {programGubun}

	public static final String CLIENT_WORKNET_RECRUIT = "worknetRecruit"; // 워크넷 채용 정보
	public static final String CLIENT_WORKNET_OPEN_EMP = "worknetOpenEmp"; // 워크넷 공채속보
	public static final String CLIENT_WORK_NET_DIAG = "workNetDiag"; // 워크넷 진단
	public static final String CLIENT_SARAMIN_RECRUIT = "saraminRecruit"; // 사람인 채용정보
	public static final String CLIENT_JOBKOREA_RECRUIT = "jobkoreaRecruit"; // 잡코리아 채용정보

	public static final String CLIENT_SBJT_MNG = "sbjtMng"; // 교과정보
	public static final String CLIENT_SHARE_PORTFOLIO = "sharePortfolio"; // 포트폴리오 페이지
	public static final String CLIENT_SMT_LEARN_MNG = "smtLearnMng"; // 교과정보 (스마트러닝?)
	public static final String CLIENT_SURVEY_MNG = "surveyMng"; // 설문조사 목록

	// ???
	public static final String GET_API_TEST = "getApiTest";
	public static final String CMM = "cmm";
	public static final String SS99 = "fms";
	public static final String COMMON = "common"; // 권한 없을 때 원래 페이지로 보내기
	public static final String LOGIN = "login"; // 로그인 관련

}
