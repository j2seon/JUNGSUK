package ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/member.do")
public class MemeberSevlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//get ��û�� doHandle�� ������
		doHandle(req, resp);
		
		
		
//		MemberDAO dao = new MemberDAO();
//		
//		
//		String id = req.getParameter("id");
//		String mode = req.getParameter("mode");
//		
//		
//		//���ListController.java
//		List<MemberDTO> boardLists = dao.MemSelect();
//        dao.close();
//        
//       
//        req.setAttribute("boardLists", boardLists);
//		
//        req.getRequestDispatcher("/member/List.jsp").forward(req, resp);
//        
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//post ��û�� doHandle�� ������

		doHandle(req, resp);

		
	
	}
	
	private void doHandle(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//get�� post ����� ��ûó��
		System.out.println("member servlet controller �۵�");
		req.setCharacterEncoding("UTF-8"); //�ѱ��� ���� ����ó��
		resp.setContentType("text/html;charset=UTF-8"); //�������� ����Ҷ� html���
		
		//DAO�� ��ü ���� : DAO�� �޼ҵ� ȣ���� ���� ��ü ����
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO();
		
		
		//��� ������ ���� �ٷ� HTML�� ���( out��ü�� �����ؾ���. )
		//Ŭ���̾�Ʈ�� ���������� HTML�� ����� ������.
		PrintWriter out = resp.getWriter();
		
		
		//Client �� Form���� �ѱ� ������ ���� �޴´�.
			//command = addMember �ϰ�� :DB�� ���� insert
			//command ="delMember �� ��� : DB���� ���� 
		String command = req.getParameter("command"); //form���� post������� hidden���� �Ѿ���� ��.
													//��ũ�� get������� �Ѿ�ü��� �ִ�.
		
		if(command != null && command.equals("addMember")) {
			//DB�� ���� insert 
			
			//form���� post������� �Ѿ���� ���� �޾Ƽ� ������ �Ҵ�.
			String id = req.getParameter("id");
			String pwd = req.getParameter("pwd");
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			
			System.out.println(id +" "+pwd+" "+name+" "+email);
			
			//DTO Setter�� ���� ���� 
			dto.setId(id);
			dto.setPwd(pwd);
			dto.setName(name);
			dto.setEmail(email);
			
			int result = dao.addMember(dto); //DB�� ���� Insert 
			if(result==1) {
				System.out.println("����");
				resp.sendRedirect("/Proj01/member.do");
			}else if(result==0) {
				System.out.println("����");
			}
		
			
		}else if(command !=null && command.equals("delMember")){
			//dB�� ���� Delete
			String id = req.getParameter("id"); //get���
			int result = dao.delMember(id);
			dao.close();
			
			if(result==1) {
				System.out.println("��������");
				resp.sendRedirect("/Proj01/member.do");
			}else if(result==0) {
				System.out.println("��������");
			}
		}
		//DB�� t_member ���̺��� ���� ��� �����ͼ� ���
		//listMember�� DB�� select�� ����� DTO�� ��� ListMember�� dto ����
		List<MemberDTO> listMember = dao.listMember();
		
		out.print("<html><body>");
		out.print("<table border =1> <tr align='center' bgcolor='lightgreen'>");
		out.print("<td>���̵�</td><td> �̸� </td><td> ��й�ȣ </td><td> �̸��� </td><td> ������ </td><td>����</td></tr>");
		
		
		for(int i = 0; i < listMember.size(); i++) {
			MemberDTO dto2 = new MemberDTO();
			dto2 = (MemberDTO)listMember.get(i); //listMember�� ����� ������ dto ��ü�� ������ ����.
			//dto�� ����� �ʵ��� ���� getter�� ����ؼ� ������ �Ҵ�.
			String id = dto2.getId();
			String pwd = dto2.getPwd();
			String name = dto2.getName();
			String email = dto2.getEmail();
			Date joinDate = dto2.getJoinDate();
			
			out.print("<tr><td>"+ id + "</td><td>"+ pwd+ " </td><td>"+
			name + "</td><td>"+ email + " </td><td>" + joinDate + "</td><td>"
			+"<a href='/Proj01/member.do?command=delMember&id="+ id +"'> ���� </td> </tr>");
		}
		
		out.print("</table>");
		out.print("</body></html>");
		out.print("<a href = '/Proj01/memberform.jsp'> �� ȸ������ϱ� </a>");
		
		
		
		
	}
	
}
