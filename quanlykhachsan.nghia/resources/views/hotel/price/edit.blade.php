@extends('hotel.templates.template')

@section('title', 'Hotel Management')

@section('main_content')
<div class="row">
  <div class="col-md-12">
    <form id="form1" class="form-horizontal" method="POST">
      <div class="panel panel-default">
        <div class="panel-heading">
          <h4 class="panel-title">Sửa giá phòng</h4>
          <input type="hidden" name="_token" value="{!! csrf_token() !!}"/>
        </div>
        @if(count($errors) > 0)
          <div class="alert alert-danger">
            <ul>
              @foreach($errors->all() as $error)
                {!! $error !!}
              @endforeach
            </ul>
          </div>
        @endif
        <div class="panel-body">
          <div class="form-group">
            <label class="col-sm-2">Tên:</label>
            <div class="col-sm-10">
              <input type="text" name="txtName" class="form-control" required value="{!! old('txtName',isset($data) ? $data['name'] : null) !!}"/>
            </div>
          </div>
          <div class="form-group">
            <label class="col-sm-2">Giá theo ngày:</label>
            <div class="col-sm-10">
              <input type="text" name="txtPriceDay" class="form-control" oninput="format_curency(this);" required value="{!! old('txtPriceDay',isset($data) ? $data['price_day'] : null) !!}"/>
            </div>
          </div>
          <div class="form-group">
            <label class="col-sm-2">Giá giờ đầu:</label>
            <div class="col-sm-10">
              <input type="text" name="txtPriceHour" class="form-control" oninput="format_curency(this);" required value="{!! old('txtPriceHour',isset($data) ? $data['price_hour'] : null) !!}"/>
            </div>
          </div>
          <div class="form-group">
            <label class="col-sm-2">Giá giờ tiếp theo:</label>
            <div class="col-sm-10">
              <input type="text" name="txtPriceHourNext" class="form-control" oninput="format_curency(this);" required value="{!! old('txtPriceHourNext',isset($data) ? $data['price_hour_next'] : null) !!}"/>
            </div>
          </div>
        </div><!-- panel-body -->
        <div class="panel-footer" style="text-align: center;">
          <button class="btn btn-primary">Submit</button>
        </div><!-- panel-footer -->
      </div><!-- panel-default -->
    </form>
      
  </div>
</div>
@endsection
